package Pc;

import java.util.ArrayList;

public class Procesos implements composite {
	private int time_exec=0;
	private ArrayList<composite> elements= new ArrayList<composite>();
	

	public int computar() {
		for(composite a: elements) {
			time_exec+=a.computar();
		}
		return time_exec;
	}

	public int getTime_exec() {
		return time_exec;
	}

	public void setTime_exec(int time_exec) {
		this.time_exec = time_exec;
	}

	public ArrayList<composite> getElements() {
		return elements;
	}

	public void setElements(ArrayList<composite> elements) {
		this.elements = elements;
	}
	
}
