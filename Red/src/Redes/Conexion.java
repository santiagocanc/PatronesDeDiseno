package Redes;

import java.util.ArrayList;

public class Conexion {

	private ArrayList<Observador> obs = new ArrayList<Observador>();
	private int status;
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
		updateObservers();
	}
	
	public void add(Observador obsr) {
		obs.add(obsr);
	}
	
	public void updateObservers() {
		obs.forEach(x -> x.actualizar());
	}
	
}
