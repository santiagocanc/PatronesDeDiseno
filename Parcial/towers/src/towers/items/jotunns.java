package towers.items;

import towers.*;

public class jotunns extends decorator{
	private String name;
	public jotunns(component element) {
		super(element);
		this.name=element.getName();
		setItem();
	}
	
	
	
	public String getStats() {
		return super.getStats();
	}


	public void setItem() {
		super.setPower(45);
		super.setPen(10);
		super.setCd(20);
		
	}
	public String getName() {
		return name;
	}
	public int[] values() {
		return new int[] {0,45,0,10,20};		
	}
}
