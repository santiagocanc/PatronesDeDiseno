package mages.objets;

import mages.Decorator;
import mages.component;

public class Soul_Reaver extends Decorator {

	public Soul_Reaver(component element) {
		super(element);
		setItem();
	}
	
	
	
	public String getStats() {
		return super.getStats();
	}


	public void setItem() {
		super.setPower(95);
		super.setCd(10);
		
	}
	
}
