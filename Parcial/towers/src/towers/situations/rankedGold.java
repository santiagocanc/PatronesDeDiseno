package towers.situations;

import towers.component;
import towers.conditions.bad_goldR;
import towers.conditions.good_goldR;

public class rankedGold implements strategy {

private component jp;
	
	public rankedGold(component pj) {
		this.jp=pj;
	}
	
	@Override
	public int Probablity() {
		return jp.getPower();
	}

	@Override
	public void exec() {
		int p = Probablity();
		System.out.println(p);
		if(p >350) {
			jp = new good_goldR(jp);
		}else {
			jp = new bad_goldR(jp);
		}
	}

	@Override
	public component getPJ() {
		return jp;
	}

}
