package towers.items;

import towers.*;

public class desolation extends decorator{
	private String name;
	public desolation(component element) {
		super(element);
		this.name=element.getName();
		setItem();
	}
	
	
	
	public String getStats() {
		return super.getStats();
	}


	public void setItem() {
		super.setPower(110);
		super.setPen(10);
		super.setCd(10);
	}
	public String getName() {
		return name;
	}
	public int[] values() {
		return new int[] {0,110,0,10,10};		
	}
}
