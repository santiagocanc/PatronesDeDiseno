package towers.items;

import towers.*;

public class Contagion extends decorator{
	private String name;
	public Contagion(component element) {
		super(element);
		this.name=element.getName();
		setItem();
	}
	
	
	
	public String getStats() {
		return super.getStats();
	}


	public void setItem() {
		super.setPower(60);
		super.setHp(150);
		
	}
	public String getName() {
		return name;
	}
	public int[] values() {
		return new int[] {150,60,0,0,0};		
	}
}
