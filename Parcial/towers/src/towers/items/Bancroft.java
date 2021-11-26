package towers.items;

import towers.component;

public class Bancroft extends decorator{
	private String name;
	
	public Bancroft(component element) {
		super(element);
		this.name=element.getName();
		setItem();
	}
	
	
	public String getStats() {
		return super.getStats();
	}


	public void setItem() {
		super.setPower(100);
		super.setHp(50);
		
		
	}
	
	public String getName() {
		return name;
	}
	

	public int[] values() {
		return new int[] {50,100,0,0,0};		
	}



}