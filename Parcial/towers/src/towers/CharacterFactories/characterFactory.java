package towers.CharacterFactories;

import towers.characters.*;

public class characterFactory {
	public ICharacter god_selected(String x) {
		ICharacter god=null;
		try {
			switch(gods.valueOf(x)) {
				case Apollo:
					god= new Apollo();
					break;
				case Anhur:
					god= new Anhur();
					break;
				case Janus:
					god= new Janus();
					break;
				case Persephone:
					god= new Persephone();
					break;
				case Ganesh:
					god= new Ganesh();
					break;
				case Geb:
					god= new Geb();
					break;
				case Achilles:
					god= new Achilles();
					break;
				case Tyr:
					god= new Tyr();
					break;
				case Loki:
					god= new Loki();
					break;
				case Thanatos:
					god= new Thanatos();
					break;
				default:
					god=null;
					
					
			}
			return god;
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
	    }
	}
}

enum gods{
	 Apollo,Anhur,Janus,Persephone,Ganesh,Geb,Achilles,Tyr,Loki,Thanatos;
}
