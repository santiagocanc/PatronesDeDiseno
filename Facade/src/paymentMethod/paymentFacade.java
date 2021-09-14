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
