package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < 355; i++) {
            if (((i <= 30) || ((i >= 300) && (i <= 350))) && i % 2 == 0) {
                number.add(i);
            }
        }
        number.forEach(a -> System.out.print(a + " "));
    }
}
