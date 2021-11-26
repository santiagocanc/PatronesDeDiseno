package towers.situations;

import towers.component;

public class MomentGame {
	public component strategyFire(String situation, component pj) {
		strategy strategy = null;
		switch(situation) {
			case "ranked":
				strategy = new rankedFire(pj);
				strategy.exec();
				break;
			case "casual":
				strategy = new casualFire(pj);
				strategy.exec();
				break;
			case "troll":
				strategy = new trollFire(pj);
				strategy.exec();
				break;
		}
		return strategy.getPJ();
	}

	public component strategyGold(String situation, component pj) {
		strategy strategy = null;
		switch(situation) {
			case "ranked":
				strategy = new rankedGold(pj);
				strategy.exec();
				break;
			case "casual":
				strategy = new casualGold(pj);
				strategy.exec();
				break;
			case "troll":
				strategy = new trollGold(pj);
				strategy.exec();
				break;
		}
		return strategy.getPJ();
	}
}
