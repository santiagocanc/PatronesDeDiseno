package towers.conditions;

import towers.component;
import towers.items.decorator;

public class bad_goldT extends decorator {

	public bad_goldT(component element) {
		super(element);
		setItem();
	}
	
	public String getStats() {
		return super.getStats();
	}

	public void setItem() {
		super.setHp(-200);
		super.setPen(-25);
		super.setPower(-51);
	}
	public int[] values() {
		return null;		
	}

}
