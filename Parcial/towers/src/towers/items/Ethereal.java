package towers.items;

import towers.*;

public class Ethereal extends decorator {
	private String name;
	public Ethereal(component element) {
		super(element);
		this.name=element.getName();
		setItem();
	}
	
	
	
	public String getStats() {
		return super.getStats();
	}


	public void setItem() {
		super.setPower(90);
		super.setHp(200);
		
	}
	public String getName() {
		return name;
	}
	public int[] values() {
		return new int[] {200,90,0,0,0};		
	}
}
