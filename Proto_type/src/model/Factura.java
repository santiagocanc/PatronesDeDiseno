package model;


public class Factura extends ITicket {

	private String id;
	private String user;
	
	public Factura(){}
	
	private Factura(Factura a) {
		super(a);
		this.id = a.id;
		this.user=a.user;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public ITicket Clone() {
		return new Factura(this);
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", user=" + user + ", id_shop"+getId_shop()+"]";
	}
	
	
}
