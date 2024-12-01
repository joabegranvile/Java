package characters;

public class MiniCharacterSimulator {

	public static void main(String[] args) {
		Character knigth = new Knigth();
		knigth.performWeapon();
		knigth.setWeapon(new SwordBehavior());
		
		Character queen = new Queen();
		queen.performWeapon();
		queen.setWeapon(new KnifeBehavior());

	}

}
