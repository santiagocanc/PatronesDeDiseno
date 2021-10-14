package mages.objets;

import mages.Decorator;
import mages.component;

public class Stone_of_Fal extends Decorator {

	public Stone_of_Fal(component element) {
		super(element);
		setItem();
	}
	
	
	
	public String getStats() {
		return super.getStats();
	}


	public void setItem() {
		super.setPower(35);
		super.setDef(80);
		super.setHp(200);
		
	}
	
}
