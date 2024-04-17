package military.machinery;

public class Tank extends military.machinery.Machine {

    private int armorThickness;

    public Tank(String name, Engine engine, int armorThickness) {
        super(name, engine);
        this.armorThickness = armorThickness;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Armor Thickness: " + armorThickness + " cm");
    }
}
