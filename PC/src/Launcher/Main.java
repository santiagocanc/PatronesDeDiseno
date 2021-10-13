package Launcher;

import Pc.*;

public class Main {
	public static void main(String[] args) {
		Procesos p1 = new Procesos();
		
		subprocesos chrome = new subprocesos(1500);
		subprocesos smite = new subprocesos(2500);
		subprocesos firefox = new subprocesos(800);
		subprocesos miner = new subprocesos(5500);
		
		p1.getElements().add(miner);
		p1.getElements().add(chrome);
		p1.getElements().add(smite);
		p1.getElements().add(firefox);
		
		Procesos p2 = new Procesos();
		subprocesos admin_memory = new subprocesos(900);
		subprocesos admin_volumen = new subprocesos(400);
		subprocesos servicios_de_cifrado = new subprocesos(600);
		subprocesos RunTime_broker = new subprocesos(190);
		
		p2.getElements().add(admin_memory);
		p2.getElements().add(admin_volumen);
		p2.getElements().add(servicios_de_cifrado);
		p2.getElements().add(RunTime_broker);
		
		Procesos p3 = new Procesos();
		subprocesos DHCP = new subprocesos(260);
		subprocesos SSDP = new subprocesos(156);
		subprocesos TCP = new subprocesos(365);
		
		p3.getElements().add(DHCP);
		p3.getElements().add(SSDP);
		p3.getElements().add(TCP);
		
		Procesos cpu = new Procesos();
		cpu.getElements().add(p1);
		cpu.getElements().add(p2);
		cpu.getElements().add(p3);
		
		System.out.println("execution time cpu ="+cpu.computar());
	}
}
