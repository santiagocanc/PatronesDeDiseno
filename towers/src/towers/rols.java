package towers;

import java.util.Arrays;

public abstract class rols {
	
	public abstract String name();
	
	public abstract String start();
		
	public abstract String normal_game();	

	public String end() {
		return " attacking the tital enenmigo";	
	}


	public String gank_l() {
		return " gank left";	
	}


	public String gank_r() {
		return " gank right";
		
	}


	public String gank_m() {
		return " gank mid";
	}
	
	public abstract String team_figth();
	
}
