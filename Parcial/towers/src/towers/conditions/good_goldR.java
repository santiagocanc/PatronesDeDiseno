package towers.conditions;

import towers.component;
import towers.items.decorator;

public class good_goldR extends decorator {

	public good_goldR(component element) {
		super(element);
		setItem();
	}
	
	public String getStats() {
		return super.getStats();
	}

	public void setItem() {
		super.setHp(200);
	}
	public int[] values() {
		return null;		
	}

}
