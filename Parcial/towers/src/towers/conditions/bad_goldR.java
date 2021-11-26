package towers.conditions;

import towers.component;
import towers.items.decorator;

public class bad_goldR extends decorator{

	public bad_goldR(component element) {
		super(element);
		setItem();
	}
	
	public String getStats() {
		return super.getStats();
	}

	public void setItem() {
		super.setHp(-100);
		super.setCd(-5);
	}
	public int[] values() {
		return null;		
	}

}
