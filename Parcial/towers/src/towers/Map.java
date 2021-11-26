package towers;

import java.util.ArrayList;

public abstract class Map extends Game{
	private int Num_phonex;
	private int Num_tower;
	private String boss;
	
	public int getNum_phonex() {
		return Num_phonex;
	}
	public void setNum_phonex(int num_phonex) {
		Num_phonex = num_phonex;
	}
	public int getNum_tower() {
		return Num_tower;
	}
	public void setNum_tower(int num_tower) {
		Num_tower = num_tower;
	}
	public String getBoss() {
		return boss;
	}
	public void setBoss(String boss) {
		this.boss = boss;
	}
	
	abstract String team_string(); 
	
	
}
