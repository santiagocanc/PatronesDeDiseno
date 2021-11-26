package towers;

public abstract class Game {
	
	private state s;
	private int time;
	
	abstract void enter(Wizard w);
	private int NUM_TEAM_ALLOWED=5;
	
	public int getNUM_TEAM_ALLOWED() {
		return NUM_TEAM_ALLOWED;
	}
	public void setNUM_TEAM_ALLOWED(int nUM_TEAM_ALLOWED) {
		NUM_TEAM_ALLOWED = nUM_TEAM_ALLOWED;
	}
	
	public boolean auth() {
		s = state.getstate();
		if(s.getStatus()=="In Match") {
			return false;
		}else {
			return true;
		}
	}
	
	public abstract void info();
	public abstract void stats();
	public abstract void in_game();
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
}

