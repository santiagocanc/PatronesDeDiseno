package paymentMethod;

public class PSEAPI implements IPaymentMethod{
	private String number;
	private double price;
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void pay() {
		System.out.println("----PSE----");
		System.out.println("Pago:"+this.calculatePrice()+"\nprice:"+this.price);
		System.out.println("PAGO ACEPTADO");
		
	}

	private String calculatePrice() {
		this.price += (this.price*0.05);
		String aux = String.valueOf(this.price);
		return aux;
	}

}
