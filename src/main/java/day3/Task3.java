package day3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (b == 0) {
                    System.out.println("Деление на 0");
                    continue;
                }
                System.out.println(a * 1.0 / b);
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода");
                break;
            }
        }
    }
}