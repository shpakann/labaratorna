package military.machinery;

public class Tank extends military.machinery.Machine {

    private int armorThickness;

    public Tank(String name, Engine engine, int armorThickness) {
        super(name, engine);
        this.armorThickness = armorThickness;
    }

//    public void fireMainGun() {
//        System.out.println(getName() + " fires its main gun!");
//    }

//    public void fireMainGun(int shellType) {
//        System.out.println(getName() + " fires its main gun with shell type: " + shellType);
//    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Armor Thickness: " + armorThickness + " cm");
    }
}
