package towers.characters;

import towers.CharacterFactories.ICharacter;

public class Ganesh implements ICharacter {

	@Override
	public int[] getData() {
		return new int[] {495,38,60,0,0}; //hp,power,def,pen,cd
	}

}
