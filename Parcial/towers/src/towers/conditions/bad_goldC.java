package towers.conditions;

import towers.component;
import towers.items.decorator;

public class bad_goldC extends decorator {

	public bad_goldC(component element) {
		super(element);
		setItem();
	}
	
	public String getStats() {
		return super.getStats();
	}

	public void setItem() {
		super.setHp(-100);
		super.setPen(-15);
		super.setPower(-51);
	}
	public int[] values() {
		return null;		
	}
}
