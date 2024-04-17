package military.machinery;
//package military.machinery.Machine;

public class Engine {

    private int horsepower; 
    private String fuelType;

    public Engine(int horsepower, String fuelType) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    public String getSpecs() {
        return horsepower + " HP, " + fuelType;
    }
}
