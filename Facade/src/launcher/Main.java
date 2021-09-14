package launcher;

import paymentMethod.paymentFacade;

public class Main {

	public static void main(String[] args) {
		paymentFacade payment = new paymentFacade();
		payment.paypalPay("112002545", 150000);
		payment.psePay("112002545",150000);
	}

}
