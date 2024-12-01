package characters;

public class ModelCharacter extends Character {
	public ModelCharacter() {
		weapon = new SwordBehavior();
	}

	@Override
	public void figth() {
		// TODO Auto-generated method stub
		System.out.println("I am an model");
	}

}
