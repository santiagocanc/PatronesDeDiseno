package model;

public class ticket_festival extends ITicket {
	private String id;
	private String user;
	private String date;

	public ticket_festival() {
	}

	private ticket_festival(ticket_festival a) {
		super(a);
		this.id = a.id;
		this.user = a.user;
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
		return new ticket_festival(this);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ticket_festival [id=" + id + ", user=" + user + ", date=" + date +", id shop= "+getId_shop()+ "]";
	}

	
}
