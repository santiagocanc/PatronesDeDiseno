package paymentMethod;

public interface IPaymentMethod {
	public void pay();
	public void setNumber(String number);
	public void setPrice(double price);
}
