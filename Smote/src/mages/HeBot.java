package mages;

public class HeBot extends component{
	
	private int hp=400;
	private int power=35;
	private int def=39;
	private int pen=0;
	private int cd=0;

	public int getHp() {
		return hp;
	}



	public void setHp(int hp) {
		this.hp = hp;
	}



	public int getPower() {
		return power;
	}



	public void setPower(int power) {
		this.power = power;
	}



	public int getDef() {
		return def;
	}



	public void setDef(int def) {
		this.def = def;
	}



	public int getPen() {
		return pen;
	}



	public void setPen(int pen) {
		this.pen = pen;
	}



	public int getCd() {
		return cd;
	}



	public void setCd(int cd) {
		this.cd = cd;
	}



	@Override
	public String getStats() {
		// TODO Auto-generated method stub
		return this.toString();
	}



	@Override
	public String toString() {
		return "HeBot [hp=" + hp + ", power=" + power + ", def=" + def + ", pen=" + pen + ", cd=" + cd + "]";
	}
	
	
}
