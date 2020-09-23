package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Решение через исключение

public class Task3var2 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 5; i++) {
                int a = Integer.parseInt(bufferedReader.readLine());
                int b = Integer.parseInt(bufferedReader.readLine());

                try {
                    double result = (a * 1.0 / b);
                    if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
                        throw new ArithmeticException();
                    }
                    System.out.println(result);
                } catch (ArithmeticException e) {
                    System.out.println("Деление на 0");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}