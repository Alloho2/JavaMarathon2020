package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        for (int i = 0; i < 1000; i++) {
            picker1.doWork();
            courier1.doWork();
        }
        System.out.println(warehouse1);
        System.out.println("Зарплата сборщика: " + picker1.getSalary());
        System.out.println("Зарплата курьера: " + courier1.getSalary());

        Warehouse warehouse2 = new Warehouse();

        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);
        for (int i = 0; i < 1000; i++) {
            picker2.doWork();
            courier2.doWork();
        }
        System.out.println(warehouse2);
        System.out.println("Зарплата сборщика " + picker2.getSalary());
        System.out.println("Зарплата курьера: " + courier2.getSalary());
    }
}
