package day16;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task1Var2 {
    public static void main(String[] args) {
        File file = new File("num.txt");
        printResult(file);

    }

    public static void printResult(File file) {
        if (!file.getAbsolutePath().endsWith(".txt")) {
            System.out.println("Формат файла не верный");
        } else {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String st;
                int summa = 0;
                int count = 0;

                while ((st = bufferedReader.readLine()) != null) {
                    String[] n = st.split(" ");
                    for (String s : n) {
                        summa += Integer.parseInt(s);
                        count++;
                    }
                }
                double result = (double) summa / count;
                double minRes = new BigDecimal(result).setScale(3, RoundingMode.UP).doubleValue();
                System.out.printf("%s" + " --> " + "%.3f", result, minRes);

            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден");
            } catch (NumberFormatException | IOException e) {
                System.out.println("Некорректный входной файл");
            }
        }
    }
}