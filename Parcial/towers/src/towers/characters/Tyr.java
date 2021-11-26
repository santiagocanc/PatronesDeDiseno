package towers.characters;

import towers.CharacterFactories.ICharacter;

public class Tyr implements ICharacter {

	@Override
	public int[] getData() {
		return new int[] {485,40,58,0,0}; //hp,power,def,pen,cd
	}

}
