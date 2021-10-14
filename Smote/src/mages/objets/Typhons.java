package mages.objets;

import mages.Decorator;
import mages.component;

public class Typhons extends Decorator{

	public Typhons(component element) {
		super(element);
		setItem();
	}
	
	
	
	public String getStats() {
		return super.getStats();
	}


	public void setItem() {
		super.setPower(70);
		super.setPen(10);
		
	}
	
}
