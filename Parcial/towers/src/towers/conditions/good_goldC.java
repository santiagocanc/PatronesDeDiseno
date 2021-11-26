package towers.conditions;

import towers.component;
import towers.items.decorator;

public class good_goldC extends decorator {

	public good_goldC(component element) {
		super(element);
		setItem();
	}
	
	public String getStats() {
		return super.getStats();
	}

	public void setItem() {
		super.setHp(150);
		super.setDef(-15);
	}
	public int[] values() {
		return null;		
	}
}
