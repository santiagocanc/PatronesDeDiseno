package Redes;

public class PC extends Observador {

	public PC(Conexion con) {
		this.com=con;
		this.com.add(this);
	}
	
	public void IO() {
		if(com.getStatus()!= 0) {
			System.out.println("I/O available");
		}else {
			System.out.println("I/O not available");
		}
	}
	
	@Override
	public void actualizar() {
		System.out.println("status: "+ (com.getStatus()));		
	}
	
}
