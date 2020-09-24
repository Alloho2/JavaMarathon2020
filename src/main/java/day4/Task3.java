package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] number = new int[12][8];
        int countTemp = 0;
        int countTemp2;
        int indexMaxLine = 0;

        for (int i = 0; i < number.length; i++) {
            countTemp2 = 0;
            for (int j = 0; j < number[0].length; j++) {
                number[i][j] = random.nextInt(50);
                countTemp2 += number[i][j];
            }
            if (countTemp <= countTemp2) {
                countTemp = countTemp2;
                indexMaxLine = i;
            }
        }
        System.out.println("Ответ: " + indexMaxLine);
    }
}
