package Pc;

public class subprocesos implements composite {
	
	private int time_exec;
	
	public subprocesos(int time) {
		this.time_exec=time;
	}
	
	public int computar() {
		// TODO Auto-generated method stub
		return this.time_exec;
	}

	public int getTime_exec() {
		return time_exec;
	}

	public void setTime_exec(int time_exec) {
		this.time_exec = time_exec;
	}

	
}
