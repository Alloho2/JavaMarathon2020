package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> car = new ArrayList<>();
        car.add("Audi");
        car.add("Toyota");
        car.add("Mitsubishi");
        car.add("Avtovaz");
        car.add("Ferrari");
        car.forEach(a -> System.out.print(a + " "));
        car.add(3, "Mazda");
        car.remove(0);
        System.out.println();
        car.forEach(a -> System.out.print(a + " "));
    }
}
