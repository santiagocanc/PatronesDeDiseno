package towers.conditions;

import towers.component;
import towers.items.decorator;

public class bad_fireC extends decorator {

	public bad_fireC(component element) {
		super(element);
		setItem();
	}
	
	public String getStats() {
		return super.getStats();
	}

	public void setItem() {
		super.setPower(-25);
		super.setHp(-50);
		super.setDef(-10);
	}
	public int[] values() {
		return null;		
	}

}
