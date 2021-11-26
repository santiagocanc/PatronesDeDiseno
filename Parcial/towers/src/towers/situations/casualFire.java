package towers.situations;

import towers.component;
import towers.conditions.*;

public class casualFire implements strategy {

	private component jp;
	
	public casualFire(component pj) {
		this.jp=pj;
	}
	
	@Override
	public int Probablity() {
		return 40+(int) (Math.random() * (( 100 - 40 )+1));
	}

	@Override
	public void exec() {
		int p = Probablity();
		System.out.println(p);
		if(p >70) {
			jp = new good_fireC(jp);
		}else {
			jp = new bad_fireC(jp);
		}
	}

	@Override
	public component getPJ() {
		return jp;
	}

}
