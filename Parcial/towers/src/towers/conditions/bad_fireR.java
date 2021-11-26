package towers.conditions;

import towers.*;
import towers.items.decorator;

public class bad_fireR extends decorator{
	public bad_fireR(component element) {
		super(element);
		setItem();
	}
	
	public String getStats() {
		return super.getStats();
	}

	public void setItem() {
		super.setPower(-50);
		super.setHp(-100);
		super.setDef(-20);
	}
	public int[] values() {
		return null;		
	}
}
