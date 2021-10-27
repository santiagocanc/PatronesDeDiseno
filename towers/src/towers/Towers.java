package towers;

public abstract class Towers {
	abstract void enter(Wizard w);
	private int NUM_TEAM_ALLOWED=5;
	
	public int getNUM_TEAM_ALLOWED() {
		return NUM_TEAM_ALLOWED;
	}
	public void setNUM_TEAM_ALLOWED(int nUM_TEAM_ALLOWED) {
		NUM_TEAM_ALLOWED = nUM_TEAM_ALLOWED;
	}
	
	public abstract void info();
	public abstract void in_game();
}

