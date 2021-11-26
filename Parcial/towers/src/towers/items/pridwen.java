package towers.items;

import towers.*;

public class pridwen extends decorator {
	private String name;
	public pridwen(component element) {
		super(element);
		this.name=element.getName();
		setItem();
	}
	
	
	
	public String getStats() {
		return super.getStats();
	}


	public void setItem() {
		super.setDef(60);
		super.setCd(20);
		
	}
	public String getName() {
		return name;
	}
	public int[] values() {
		return new int[] {0,0,60,0,20};		
	}
}
