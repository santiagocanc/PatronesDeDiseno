package towers.conditions;

import towers.component;
import towers.items.decorator;

public class good_goldT extends decorator {

	public good_goldT(component element) {
		super(element);
		setItem();
	}
	
	public String getStats() {
		return super.getStats();
	}

	public void setItem() {
		super.setHp(250);
		super.setPen(16);
		super.setPower(2);
	}
	public int[] values() {
		return null;		
	}
}
