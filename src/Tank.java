package military.machinery;

public class Tank implements military.machinery.Machine {

    private int armorThickness;
    private String tankName;
    private String fuelType;
    private int hoursePower = 0;


    public Tank(String name, String fuelType, int horsePower, int armorThickness) {
        this.tankName = name;
        this.fuelType = fuelType;
        this.hoursePower = horsePower;
        this.armorThickness = armorThickness;
    }

    public String getFullInformation(){
        return  "Tank name: " + tankName + "\nfuel type: " + fuelType + "\nHorse power: " + hoursePower +
                "\nTroop capacity: " + armorThickness;
    }

    public String getName(){
        return "Tank name" + tankName;
    }

    public String getFuelType(){
        return "Fuel type: " + fuelType;
    }

    public int getHorsePower() {
        return hoursePower;
    }
}
