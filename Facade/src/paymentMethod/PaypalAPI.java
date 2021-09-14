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
