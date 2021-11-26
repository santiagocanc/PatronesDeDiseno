package towers.situations;

import towers.component;
import towers.conditions.*;

public class rankedFire implements strategy {

	private component jp;
	
	public rankedFire(component pj) {
		this.jp=pj;
	}
	
	@Override
	public int Probablity() {
		return 60+(int) (Math.random() * (( 100 - 60 )+1));
	}

	@Override
	public void exec() {
		int p = Probablity();
		System.out.println(p);
		if(p >70) {
			jp = new good_fireR(jp);
		}else {
			jp = new bad_fireR(jp);
		}
	}

	@Override
	public component getPJ() {
		return jp;
	}

}
