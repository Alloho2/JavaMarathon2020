package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(bufferedReader.readLine());
            double y;

            if (x >= 5) {
                y = (Math.pow(x, 2) - 10) / (x + 7);
            } else if (x > -3) {
                y = ((x + 3) * ((Math.pow(x, 2) - 2)));
            } else {
                y = 420;
            }
            System.out.println("Ответ: " + y);
        } catch (NumberFormatException | IOException e) {
            System.out.println("Ошибка ввода");
        }
    }
}
