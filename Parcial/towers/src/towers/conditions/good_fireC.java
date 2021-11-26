package towers.conditions;

import towers.component;
import towers.items.decorator;

public class good_fireC extends decorator {

	public good_fireC(component element) {
		super(element);
		setItem();
	}
	
	public String getStats() {
		return super.getStats();
	}

	public void setItem() {
		super.setPower(50);
		super.setHp(50);
		super.setDef(40);
	}
	public int[] values() {
		return null;		
	}

}
