package towers;

public abstract class component {
	private String name;
	private int hp;
	private int power;
	private int def;
	private int pen;
	private int cd;
	
	public abstract String getStats();

	public int getHp() {
		return this.hp;
	}

	public abstract void setHp(int hp);

	public int getPower() {
		return this.power;
	}

	public abstract void setPower(int power);

	public int getDef() {
		return this.def;
	}

	public abstract void setDef(int def);

	public int getPen() {
		return this.pen;
	}

	public abstract void setPen(int pen);

	public int getCd() {
		return this.cd;
	}

	public abstract void setCd(int cd);

	public String getName() {
		return name;
	}

	public abstract void setName(String x);
}
