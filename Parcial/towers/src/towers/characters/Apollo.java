package towers.characters;

import towers.CharacterFactories.ICharacter;

public class Apollo implements ICharacter {

	@Override
	public int[] getData() {
		return new int[] {450,40,42,0,0}; //hp,power,def,pen,cd
	}

}
