package day15;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/shoes.csv");
        endProduct(file);
    }

    public static void endProduct(File file) {
        if (!file.getAbsolutePath().endsWith(".csv")) {
            System.out.println("Формат файла не верный");
        } else {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 FileOutputStream fos = new FileOutputStream("src/main/resources/missing_shoes.txt")) {
                String st;

                while ((st = bufferedReader.readLine()) != null) {
                    int count = Integer.parseInt(st.substring(st.lastIndexOf(";") + 1));
                    if (count == 0) {
                        fos.write((st.replaceAll(";", ", ") + System.lineSeparator()).getBytes());
                    }
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Некорректный входной файл");
            }
        }
    }
}

