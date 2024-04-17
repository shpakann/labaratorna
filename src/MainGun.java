package military.weapons;

public class MainGun extends military.weapons.Weapon {

    public MainGun(String name, double caliber) {
        super(name, caliber);
    }

    @Override
    public void fire() {
        System.out.println(getName() + " fires!");
    }
}
