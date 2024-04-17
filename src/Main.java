

import military.machinery.APC; // Імпорт класу APC з пакету military.machinery
//import military.machinery.Engine; // Імпорт класу Engine з пакету military.machinery
//import military.machinery.Machine; // Імпорт класу Machine з пакету military.machinery
import military.machinery.Tank; // Імпорт класу Tank з пакету military.machinery
//import military.weapons.MainGun; // Імпорт класу MainGun з пакету military.weapons

import java.util.Scanner; // Імпорт класу Scanner з пакету java.util

public class Main {

    public static void main(String[] args) {
        APC apc = new APC("Boxer", "disel", 200, 5);
        System.out.println(apc.getFullInformation());
        System.out.println("---\tAnother vehicle\t--- "); // Вивід розділювача між танком і БМП
        Tank tank = new Tank("abrams","diesel", 200, 120);
        System.out.println(tank.getFullInformation());
    }
}
