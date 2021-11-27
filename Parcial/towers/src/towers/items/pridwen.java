package towers.items;

import towers.*;

public class pridwen extends decorator {
	private String name;
	private int hp;
	public pridwen(component element) {
		super(element);
		this.name=element.getName();
		this.hp=element.getHp();
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
	public int getHp() {
		return hp;
	}
}
