package towers;

import java.util.Scanner;

import towers.items.*;
import towers.situations.MomentGame;

public class Wizard {
	private String name;
	private component rol;
	private int MAX_ITEMS = 6;
	public int items=0;
	private MomentGame mg=new MomentGame();
	
	public Wizard(String name, component rol) {
		this.name=name;
		this.rol=rol;
	}
	

	public String to_string_match() {
		return name;
	}
	@Override
	public String toString() {
		return name + " -> "+rol.getName();
	}
	public String getStats() {
		return name+"\t"+" "+rol.getName()+rol.getStats();
	}
	public int getHp() {
		return rol.getHp();
	}
	
	private void store() {
		shop[] a = null;
		System.out.println(rol.getName());
		System.out.println(rol.getClass());
		if(items < MAX_ITEMS) {
			System.out.println("============ITEMS============");
			if(rol.getName()=="MAGE"||rol.getName()=="SUPP") {
				a = shop.Magical();
				
				for(shop x: a) {
					System.out.println(x.name());
				}	
			}else if (rol.getName()=="ADC"||rol.getName()=="SOLO") {
				a = shop.Physical();
				for(shop x: a) {
					System.out.println(x.name());
				}	
			}else if (rol.getName()=="JG") {
				a = shop.All();
				for(shop x: a) {
					System.out.println(x.name());
				}
			}
			Scanner input = new Scanner(System.in);
			String option= input.nextLine();
			switch(shop.valueOf(option)) {
				case bancroft:
					rol = new Bancroft(rol);
					items++;
					break;
				case pridwen:
					rol = new pridwen(rol);
					items++;
					break;
				case Etherial:
					rol = new Ethereal(rol);
					items++;
					break;
				case blackthorn:
					rol = new blackthorn(rol);
					items++;
					break;
				case dagger:
					rol = new Dagger(rol);
					items++;
					break;
				case desolation:
					rol = new desolation(rol);
					items++;
					break;
				case contagion:
					rol = new Contagion(rol);
					items++;
					break;
				case jotunns:
					rol = new jotunns(rol);
					items++;
					break;
			}
		}
	}
	
	public void action(String x, int time, boolean full) {
		try {
			work(Actions.valueOf(x),time, full);
		}catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
	private void work(Actions A, int time, boolean full) {
		switch(A) {
		case SHOP:
			if(!full) {
				store();
			}
			break;
		case FIRE:
			dofire(time);
			break;
		case GOLD:
			dogold(time);
			break;
		}
	}
	private void dofire(int time) {
		if(time<5) {
			mg.strategyFire("troll", rol);
		}else if(time<=10) {
			mg.strategyFire("casual", rol);
		}else if(time>10) {
			mg.strategyFire("ranked", rol);
		}
	}
	private void dogold(int time) {
		if(time<5) {
			mg.strategyGold("troll", rol);
		}else if(time<=10) {
			mg.strategyGold("casual", rol);
		}else if(time>10) {
			mg.strategyGold("ranked", rol);
		}
	}
	
}

enum Actions{
	SHOP,FIRE,GOLD;
}

enum shop{
	bancroft, pridwen,Etherial,blackthorn,dagger,desolation,contagion,jotunns;
	
	public static shop[] Magical() {
		return new shop[] {bancroft,pridwen,Etherial,desolation};
	}
	
	public static shop[] Physical() {
		return new shop[] {blackthorn,dagger,contagion,jotunns};
	}
	public static shop[] All() {
		return new shop[] {bancroft, pridwen,Etherial,blackthorn,dagger,desolation,contagion,jotunns};
	}
}
