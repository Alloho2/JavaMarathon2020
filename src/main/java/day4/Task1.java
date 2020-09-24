package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите размер массива:");
            int n = Integer.parseInt(bufferedReader.readLine());
            int[] number = new int[n];
            Random random = new Random();
            for (int i = 0; i < number.length; i++) {
                number[i] = random.nextInt(10);
            }
            for (int x : number) {
                if (x > 8) {
                    count1++;
                }
                if (x == 1) {
                    count2++;
                }
                if (x % 2 == 0) {
                    count3++;
                }
                if (x % 2 != 0) {
                    count4++;
                }
                count5 += x;
            }
            System.out.println("Введено число " + n + ". Сгенерирован следующий массив:");
            System.out.println(Arrays.toString(number));
            System.out.println("Информация о массиве:" + System.lineSeparator() + "Длинна масива: " + number.length);
            System.out.println("Количество чисел больше 8: " + count1);
            System.out.println("Количество чисел равных 1: " + count2);
            System.out.println("Количество четных чисел: " + count3);
            System.out.println("Количество нечетных чисел:: " + count4);
            System.out.println("Сумма всех элементов массива: " + count5);
        } catch (NumberFormatException | IOException e) {
            System.out.println("Ошибка ввода");
        }
    }
}
