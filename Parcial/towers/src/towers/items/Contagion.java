package towers.items;

import towers.*;

public class Contagion extends decorator{
	private String name;
	private int hp;
	public Contagion(component element) {
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
