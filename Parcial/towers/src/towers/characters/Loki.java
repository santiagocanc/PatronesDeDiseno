package towers.characters;

import towers.CharacterFactories.ICharacter;

public class Loki implements ICharacter {

	@Override
	public int[] getData() {
		return new int[] {395,40,41,0,0}; //hp,power,def,pen,cd
	}

}
