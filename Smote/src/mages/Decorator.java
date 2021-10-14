package mages;


public abstract class Decorator extends component {
	private component element;

	public Decorator(component element) {
		this.element = element;
	}
	
	public abstract void setItem();
	
	public String getStats() {
		return element.getStats();
	}
	
	
	public void setHp(int hp) {
		element.setHp(element.getHp()+hp);
	}
	
	public void setPower(int power) {
		element.setPower(element.getPower()+power);
		
	}

	public void setDef(int def) {
		element.setDef(element.getDef()+def);
	}

	public void setPen(int pen) {
		element.setPen(element.getPen()+pen);
	}

	public void setCd(int cd) {
		element.setCd(element.getCd()+cd);
	}
	
}
