package towers.characters;

import towers.CharacterFactories.ICharacter;

public class Geb implements ICharacter {

	@Override
	public int[] getData() {
		return new int[] {510,38,59,0,0}; //hp,power,def,pen,cd
	}

}
