package towers.rols;

import towers.component;
import towers.CharacterFactories.ICharacter;

public class adc extends component {
	private String name;
	private int hp=800;
	private int power=15;
	private int def=5;
	private int pen=0;
	private int cd=0;
	
	public adc(ICharacter character) {
		this.setName("ADC");
		this.hp = character.getData()[0];
		this.power = character.getData()[1];
		this.def = character.getData()[2];
		this.pen = character.getData()[3];
		this.cd = character.getData()[4];
	}

	@Override
	public String getStats() {
		return " [hp=" + hp +", power=" + power + ", def=" + def + ", pen=" + pen + ", cd=" + cd + "]";
	}

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

	public String getName() {
		return name;
	}

	@Override
	public void setName(String x) {
		this.name=x;	
	}

	
}
