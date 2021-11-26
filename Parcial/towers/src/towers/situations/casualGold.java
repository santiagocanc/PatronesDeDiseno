package towers.situations;

import towers.component;
import towers.conditions.bad_goldC;
import towers.conditions.good_goldC;

public class casualGold implements strategy {

private component jp;
	
	public casualGold(component pj) {
		this.jp=pj;
	}
	
	@Override
	public int Probablity() {
		return jp.getPower()+jp.getDef();
	}

	@Override
	public void exec() {
		int p = Probablity();
		System.out.println(p);
		if(p >500) {
			jp = new good_goldC(jp);
		}else {
			jp = new bad_goldC(jp);
		}
	}

	@Override
	public component getPJ() {
		return jp;
	}

}
