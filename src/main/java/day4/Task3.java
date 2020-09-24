package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] number = new int[12][8];

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[0].length; j++) {
                number[i][j] = random.nextInt(50);
            }
        }
        int count = 0;
        int count2;
        int str = 0;

        for (int i = 0; i < number.length; i++) {
            count2 = 0;
            for (int j = 0; j < number[0].length; j++) {
                count2 += number[i][j];
            }
            if (count <= count2) {
                count = count2;
                str = i;
            }
        }
        System.out.println("Ответ: " + str);
    }
}
