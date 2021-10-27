package towers;

public class launcher {
	public static void main(String[] args) {
		proxy px = new proxy(new joustTeam("RED"));
		px.enter(new Wizard("He bo",new jungle()));
		px.enter(new Wizard("Hel",new mage()));
		px.enter(new Wizard("apollo",new adc()));
		px.enter(new Wizard("kumba",new support()));
		px.enter(new Wizard("zk",new solo()));	
		px.info();
		px.in_game();
	}
}
