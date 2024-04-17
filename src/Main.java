

import military.machinery.APC; // Імпорт класу APC з пакету military.machinery
import military.machinery.Engine; // Імпорт класу Engine з пакету military.machinery
import military.machinery.Machine; // Імпорт класу Machine з пакету military.machinery
import military.machinery.Tank; // Імпорт класу Tank з пакету military.machinery
import military.weapons.MainGun; // Імпорт класу MainGun з пакету military.weapons

import java.util.Scanner; // Імпорт класу Scanner з пакету java.util

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // Створення об'єкту класу Scanner для зчитування з клавіатури

        // Create engine objects
        System.out.println("Enter horse power of first vehicle");
        int horsePower = in.nextInt(); // Зчитування введеного користувачем значення потужності двигуна
        in.nextLine();
        System.out.println("Enter fuel type of first vehicle");
        String fuelType = in.nextLine(); // Зчитування введеного користувачем типу палива

        Engine tankEngine = new Engine(horsePower, fuelType); // Створення об'єкту класу Engine для танка з введеними користувачем параметрами
        Engine apcEngine = new Engine(750, "Diesel"); // Створення об'єкту класу Engine для БМП з передбаченими параметрами

        // Create weapon object
        MainGun tankGun = new MainGun("M256", 120.0); // Створення об'єкту класу MainGun для головної зброї танка з заданими характеристиками

        // Create Machine objects
        Machine tank = new Tank("M1 Abrams", tankEngine, 60); // Створення об'єкту класу Tank через композицію з введеною назвою, двигуном та обсягом палива
        Machine apc = new APC("Bradley", apcEngine, 12); // Створення об'єкту класу APC з введеною назвою, двигуном та обсягом палива

        // Display information about each machine
        tank.displayInfo(); // Виведення інформації про танк
        System.out.println("---\tAnother vehicle\t--- "); // Вивід розділювача між танком і БМП
        apc.displayInfo(); // Виведення інформації про БМП

    }
}
