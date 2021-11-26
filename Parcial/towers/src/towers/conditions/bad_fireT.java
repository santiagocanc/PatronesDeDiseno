package towers.conditions;

import towers.component;
import towers.items.decorator;

public class bad_fireT extends decorator {

	public bad_fireT(component element) {
		super(element);
		setItem();
	}
	
	public String getStats() {
		return super.getStats();
	}

	public void setItem() {
		super.setPower(-40);
		super.setHp(-110);
		super.setDef(-20);
	}
	public int[] values() {
		return null;		
	}

}
