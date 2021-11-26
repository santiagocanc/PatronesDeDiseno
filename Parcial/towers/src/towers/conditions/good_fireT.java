package towers.conditions;

import towers.component;
import towers.items.decorator;

public class good_fireT extends decorator {

	public good_fireT(component element) {
		super(element);
		setItem();
	}
	
	public String getStats() {
		return super.getStats();
	}

	public void setItem() {
		super.setPower(70);
		super.setHp(120);
		super.setDef(52);
	}
	public int[] values() {
		return null;		
	}

}
