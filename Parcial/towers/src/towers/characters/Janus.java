package towers.characters;

import towers.CharacterFactories.ICharacter;

public class Janus implements ICharacter {

	@Override
	public int[] getData() {
		return new int[] {400,34,38,0,0}; //hp,power,def,pen,cd
	}

}
