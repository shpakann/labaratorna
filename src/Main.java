

import military.machinery.APC; // Імпорт класу APC з пакету military.machinery
import military.machinery.Tank; // Імпорт класу Tank з пакету military.machinery
import military.machinery.ArmoredMachine;
import java.util.Scanner; // Імпорт класу Scanner з пакету java.util

public class Main {

    public static void main(String[] args) {
        APC apc = new APC("Boxer", "disel", 200, 5);
        System.out.println(apc.getFullInformation());
        System.out.println("---\tAnother vehicle\t--- ");
        Tank tank = new Tank("abrams","diesel", 200, 120); // Конструктор з парметрами такими як name "abrams"
        System.out.println(tank.getFullInformation());
        System.out.println("---\tGENERALIZATION vehicle\t--- ");
        ArmoredMachine<Tank> generalization_exmaple = new ArmoredMachine<Tank>(tank);  // GENERALIZATION
        System.out.println(generalization_exmaple.getMachineDescription());
    }
}
