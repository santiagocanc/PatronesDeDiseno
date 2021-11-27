package towers.items;

import towers.component;

public class Bancroft extends decorator{
	private String name;
	private int hp;
	
	public Bancroft(component element) {
		super(element);
		this.name=element.getName();
		this.hp=element.getHp();
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
	
	public int getHp() {
		return hp;
	}

	public int[] values() {
		return new int[] {50,100,0,0,0};		
	}



}