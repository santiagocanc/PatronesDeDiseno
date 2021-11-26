package towers.characters;

import towers.CharacterFactories.ICharacter;

public class Thanatos implements ICharacter {

	@Override
	public int[] getData() {
		return new int[] {390,45,44,0,0}; //hp,power,def,pen,cd
	}

}
