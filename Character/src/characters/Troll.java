package characters;

public class Troll extends Character {
	public Troll() {
		weapon = new WeaponBehavior() {
			
			@Override
			public void useWeapon() {
				System.out.println("I am an Troll");
				
			}
		};
	}

	@Override
	public void figth() {
		System.out.println("I am an Troll");
		
	}
}
