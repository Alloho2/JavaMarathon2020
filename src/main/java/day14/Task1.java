package day14;

import java.io.*;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("num.txt"))) {
            String st = bufferedReader.readLine();
            int[] num = Arrays.stream(st.split(" ")).mapToInt(Integer::parseInt).toArray();
            if (num.length != 10) throw new IOException();
            System.out.println(Arrays.stream(num).sum());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberFormatException | IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
