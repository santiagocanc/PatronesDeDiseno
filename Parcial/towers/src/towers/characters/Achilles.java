package towers.characters;

import towers.CharacterFactories.ICharacter;

public class Achilles implements ICharacter {

	@Override
	public int[] getData() {
		return new int[] {475,38,47,0,0}; //hp,power,def,pen,cd
	}

}
