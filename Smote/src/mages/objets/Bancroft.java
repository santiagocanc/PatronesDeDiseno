package mages.objets;

import mages.Decorator;
import mages.component;

public class Bancroft extends Decorator{

	public Bancroft(component element) {
		super(element);
		setItem();
	}
	
	
	
	public String getStats() {
		return super.getStats();
	}


	public void setItem() {
		super.setPower(100);
		super.setHp(50);
		
	}

}
