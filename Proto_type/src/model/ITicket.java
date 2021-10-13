package model;

public abstract class ITicket {
	private int id_shop;

	public ITicket() {
	}

	protected ITicket(ITicket s) {
		this.id_shop = s.id_shop;
	}

	public int getId_shop() {
		return id_shop;
	}

	public void setId_shop(int id_shop) {
		this.id_shop = id_shop;
	}

	public abstract ITicket Clone();
}
