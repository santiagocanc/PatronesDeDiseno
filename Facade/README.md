---

DesingPattern: Facade
Title: paymentMethod
Categories: Structural
Language: es/en

---
## Facade Pattern

Facade define a higher-level interface that makes the subsystem easier to use

Wikipedia

>A facade is an object that provides a simplified interface to a large body of code, such as a class library.

## Description Problem

It is a payment system with Paypal and PSE as options. The facade is used to "manage" each of the APIs of the payment Methods

## Code

```java
package paymentMethod;

public class PaypalAPI implements IPaymentMethod{
	private String number;
	private double price;
  
	public void setNumber(String number) {
		this.number = number;
	}
  
	public void setPrice(double price) {
		this.price = price;
	}
  
	public void pay() {
		System.out.println("----Paypal----");
		System.out.println("Pago:"+this.number+"\nPrice:"+this.price);
		System.out.println("PAGO ACEPTADO");
	}
}
```

This class is a kind of "API" which allows paypal payment, so a front end will be used to manage it.

```java
package paymentMethod;

public class paymentFacade {
	private IPaymentMethod payment;
	
	public void paypalPay(String a,int b) {
		payment = new PaypalAPI();
		payment.setNumber(a);
		payment.setPrice(b);
		payment.pay();
	}
	public void psePay(String a,int b) {
		payment = new PSEAPI();
		payment.setNumber(a);
		payment.setPrice(b);
		payment.pay();
	}
}
```

## Class diagram

![](./etc/facade.urm.png "Class Diagram")
