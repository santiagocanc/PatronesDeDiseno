package towers.conditions;

import towers.*;
import towers.items.decorator;

public class good_fireR extends decorator {
	public good_fireR(component element) {
		super(element);
		setItem();
	}
	
	
	
	public String getStats() {
		return super.getStats();
	}


	public void setItem() {
		super.setPower(25);
		super.setHp(200);
		super.setDef(10);
	}
	public int[] values() {
		return null;		
	}
}
