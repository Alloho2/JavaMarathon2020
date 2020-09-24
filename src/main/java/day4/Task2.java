package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[100];

        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(10_000);
        }
        int count1 = 0;
        int count2 = 0;
        int max = number[0];
        int min = number[0];

        for (int x : number) {
            if (max < x) {
                max = x;
            }
            if (min > x) {
                min = x;
            }
            if (x % 10 == 0) {
                count1++;
                count2 += x;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count1);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + count2);
    }
}

