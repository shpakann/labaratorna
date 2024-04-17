package military.weapons;

public abstract class Weapon {

    private String name;
    private double caliber;

    public Weapon(String name, double caliber) {
        this.name = name;
        this.caliber = caliber;
    }

    public String getName() {
        return name;
    }

    public abstract void fire();
}
