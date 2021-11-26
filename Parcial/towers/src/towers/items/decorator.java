package towers.items;

import towers.component;

public abstract class decorator extends component {
	private component element;

	public decorator(component element) {
		this.element = element;
	}
	
	public abstract void setItem();
	public abstract int[] values();
	
	public String getStats() {
		return element.getStats();
	}
	
	
	public void setHp(int hp) {
		if((element.getHp()+hp)<=5000) {
			element.setHp(element.getHp()+hp);
		}else {
			element.setHp(5000);
		}
	}
	
	public void setName(String x){
		System.out.println(x);
		element.setName(x);
	}
	
	private void physical(int power) {
		if((element.getPower()+power)<=400){
			element.setPower(element.getPower()+power);
		}else {
			element.setPower(400);
		}
	}
	
	private void Magical(int power) {
		if((element.getPower()+power)<=900){
			element.setPower(element.getPower()+power);
		}else {
			element.setPower(900);
		}
	}
	private void jungle(int power) {
		if((element.getPower()+power)<=700){
			element.setPower(element.getPower()+power);
		}else {
			element.setPower(700);
		}
	}
	
	public void setPower(int power) {
		if((element.getName()=="ADC") || (element.getName()=="SOLO")){
			physical(power);
		}else if((element.getName()=="MAGE") || (element.getName()=="SUPP")){
			Magical(power);
		}else if(element.getName()=="JG"){
			jungle(power);
		}
	}

	public void setDef(int def) {
		if((element.getDef()+def)<=650) {
			element.setDef(element.getDef()+def);
		}else {
			element.setDef(650);
		}
	}

	public void setPen(int pen) {
		if((element.getPen()+pen)<=90) {
			element.setPen(element.getPen()+pen);
		}else {
			element.setPen(90);
		}
	}

	public void setCd(int cd) {
		if((element.getCd()+cd)<=40) {
			element.setCd(element.getCd()+cd);
	
		}else {
			element.setCd(40);
		}
	}
	
}
