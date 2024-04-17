package military.machinery;

public class Machine {

    public String name;
    public military.machinery.Engine engine;

    public Machine(String name, military.machinery.Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }
}
