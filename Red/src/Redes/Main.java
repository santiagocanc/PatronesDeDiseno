package Redes;

public class Main {
	public static void main(String[] args) {
		Conexion com = new Conexion();
		PC p1 = new PC(com);
		PC p2 = new PC(com);
		

		com.setStatus(0);
		p1.IO();
		p2.IO();
		com.setStatus(1);
		p1.IO();
		p2.IO();
	}
}
