package military.machinery;

public class APC implements military.machinery.Machine {

    private String APC_name;
    private String fuelType;
    private int hoursePower = 0;
    protected int troopCapacity; //це для того,  щоб дозволити доступ до нього в класах-спадкоємцях і в тому ж пакеті

    public APC(String name, String fuelType, int horsePower,  int troopCapacity) {
        this.APC_name = name;
        this.fuelType = fuelType;
        this.hoursePower = horsePower;
        this.troopCapacity = troopCapacity;
    }

    public String getFullInformation(){
        return  "APC name: " + APC_name + "\nfuel type: " + fuelType + "\nHorse power: " + hoursePower +
                "\nTroop capacity: " + troopCapacity;
    }

    public String getName(){
        return "APC name" + APC_name;
    }

    public String getFuelType(){
        return "Fuel type: " + fuelType;
    }

    public int getHorsePower() {
        return hoursePower;
    }
}
