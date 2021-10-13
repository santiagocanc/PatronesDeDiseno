package Launcher;

import model.Factura;

public class Main {
	public static void main(String[] args) {
		Factura shop = new Factura();
		shop.setId("1");
		shop.setId_shop(11202);
		shop.setUser("jean");
		
		Factura shop2 = (Factura) shop.Clone();
		shop2.setId_shop(11259);
		
		Factura shop3 = (Factura) shop2.Clone();
		shop3.setId_shop(115648);
		shop3.setUser("Marco");
		
		System.out.println(shop.toString()+" "+System.identityHashCode(shop));
		System.out.println(shop2.toString()+" "+System.identityHashCode(shop2));
		System.out.println(shop3.toString()+" "+System.identityHashCode(shop3));
	}
}
