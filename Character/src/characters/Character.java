package characters;

public abstract class Character {
	WeaponBehavior weapon;
	
	public Character() {}
	
	public abstract void figth();
	
	public void performWeapon() {
        weapon.useWeapon();;
    }
	
	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}
}
