package characters;

public class Queen extends Character {
	public Queen() {
		weapon = new KnifeBehavior() {

		};
	}

	@Override
	public void figth() {
		System.out.println("I am a Queen");
		
	}
}
