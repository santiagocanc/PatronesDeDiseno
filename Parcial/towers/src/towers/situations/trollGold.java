package towers.situations;

import towers.component;
import towers.conditions.bad_goldT;
import towers.conditions.good_goldT;

public class trollGold implements strategy {

	private component jp;
	
	public trollGold(component pj) {
		this.jp=pj;
	}
	
	@Override
	public int Probablity() {
		return jp.getPower()+jp.getDef()+jp.getPen()+jp.getHp();
	}

	@Override
	public void exec() {
		int p = Probablity();
		System.out.println(p);
		if(p >1300) {
			jp = new good_goldT(jp);
		}else {
			jp = new bad_goldT(jp);
		}
	}

	@Override
	public component getPJ() {
		return jp;
	}

}
