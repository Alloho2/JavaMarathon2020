package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a > b) {
                System.out.println("Ошибка! Первое число не может быть больше второго.");
            } else {
                a++;
                int count = 0;
                while (a < b) {
                    if (a % 5 == 0 & a % 10 != 0) {
                        System.out.print(a + " ");
                        count++;
                    }
                    a++;
                }
                if (count == 0) {
                    System.out.println("Чисел в указанном диапазоне нет.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода");
        }
    }
}
