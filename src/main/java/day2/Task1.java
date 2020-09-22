package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int floor = Integer.parseInt(bufferedReader.readLine());

            if (floor <= 0) {
                System.out.println("Ошибка ввода");
            }

            if (floor >= 1 && floor <= 4) {
                System.out.println("Малоэтажный дом");
            }

            if (floor >= 5 && floor <= 8) {
                System.out.println("Среднеэтажный дом");
            }

            if (floor >= 9) {
                System.out.println("Многоэтажный дом");
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("Ошибка ввода");
        }
    }
}
