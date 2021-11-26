package towers;

import towers.CharacterFactories.characterFactory;
import towers.rols.adc;
import towers.rols.jungle;
import towers.rols.mage;

public class launcher {
	public static void main(String[] args) {
		characterFactory cf = new characterFactory();
		Wizard adc = new Wizard("apollo",new adc(cf.god_selected("Apollo")));
		proxy px = new proxy(new joustTeam("RED"));
		px.enter(new Wizard("Loki",new jungle(cf.god_selected("Loki"))));
		px.enter(new Wizard("Janus",new mage(cf.god_selected("Janus"))));
		px.enter(adc);
		px.enter(new Wizard("ZK",new mage(cf.god_selected("Janus"))));
		//px.stats();
		px.in_game();
		state s = state.getstate();
		System.out.println(s.getStatus());
	}
}
