package military.machinery;

public class ArmoredMachine <T extends military.machinery.Machine>{
    private T machine;
    public ArmoredMachine(T machine){
        this.machine = machine;
    }
    public String getMachineDescription(){
        return machine.getFullInformation();
    }
}
