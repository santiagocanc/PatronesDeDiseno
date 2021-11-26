package towers.situations;

import towers.component;
import towers.conditions.bad_fireT;
import towers.conditions.good_fireT;

public class trollFire implements strategy {

	private component jp;
	
	public trollFire(component pj) {
		this.jp=pj;
	}
	
	@Override
	public int Probablity() {
		return 1+(int) (Math.random() * (( 100 - 1 )+1));
	}

	@Override
	public void exec() {
		int p = Probablity();
		System.out.println(p);
		if(p >70) {
			jp = new good_fireT(jp);
		}else {
			jp = new bad_fireT(jp);
		}
	}

	@Override
	public component getPJ() {
		return jp;
	}

}
