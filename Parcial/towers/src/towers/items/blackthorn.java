package towers.items;

import towers.*;

public class blackthorn extends decorator {
	private String name;
	private int hp;
	public blackthorn(component element) {
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
		super.setPower(40);
		super.setHp(400);
		
	}

	public String getName() {
		return name;
	}

	@Override
	public int[] values() {
		return new int[] {400,40,0,0,0};		
	}
}
