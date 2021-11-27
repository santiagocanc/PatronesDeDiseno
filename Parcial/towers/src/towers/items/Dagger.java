package towers.items;

import towers.*;

public class Dagger extends decorator{
	private String name;
	private int hp;
	public Dagger(component element) {
		super(element);
		this.name=element.getName();
		this.hp=element.getHp();
		setItem();
	}
	
	public int getHp() {
		return hp;
	}
	
	
	public String getStats() {
		return super.getStats();
	}


	public void setItem() {
		super.setHp(350);
		super.setCd(10);
		
	}
	public String getName() {
		return name;
	}
	public int[] values() {
		return new int[] {350,0,0,0,10};		
	}
}
