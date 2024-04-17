package military.machinery;

public class APC extends military.machinery.Machine {

    protected int troopCapacity; //це для того,  щоб дозволити доступ до нього в класах-спадкоємцях і в тому ж пакеті

    public APC(String name, Engine engine, int troopCapacity) {
        super(name, engine); // Call superclass constructor to initialize name and engine
        this.troopCapacity = troopCapacity;
    }

    public void loadTroops(int numTroops) {
        System.out.println(getName() + " loading " + numTroops + " troops.");
    }

    public void loadTroops(int numTroops, String location) {
        System.out.println(getName() + " loading " + numTroops + " troops at " + location + ".");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass displayInfo() to display general machine info
        System.out.println("Troop Capacity: " + troopCapacity);
    }
}
