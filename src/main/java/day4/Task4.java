package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] number = new int[100];
        Random random = new Random();

        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(10_000);
        }
        int num1 = number[0];
        int num2 = number[1];
        int num3 = number[2];
        int result = 0;

        for (int i = 0; i < number.length - 2; i++) {
            if ((num1 + num2 + num3) < (number[i] + number[i + 1] + number[i + 2])) {
                num1 = number[i];
                num2 = number[i + 1];
                num3 = number[i + 2];
                result = i;
            }
        }
        System.out.println(num1 + num2 + num3);
        System.out.println(result);
    }
}
