package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(bufferedReader.readLine());
            int b = Integer.parseInt(bufferedReader.readLine());

            if (a >= b) {
                System.out.println("Ошибка! Первое число не может быть больше или равно второму.");
            } else {
                int count = 0;

                for (int i = a + 1; i < b; i++) {
                    if (i % 5 == 0 & i % 10 != 0) {
                        count++;
                        System.out.print(i + " ");
                    }
                }
                if (count == 0) {
                    System.out.println("Чисел в указанном диапазоне нет.");
                }
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("Ошибка ввода");
        }
    }
}