package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                int a = Integer.parseInt(bufferedReader.readLine());
                int b = Integer.parseInt(bufferedReader.readLine());
                if (b == 0) {
                    break;
                }
                System.out.println(a * 1.0 / b);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}