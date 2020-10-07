package day16;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        Path pathIn = Paths.get("file1.txt");
        Path pathOut = Paths.get("file2.txt");
        StringBuilder result1File = new StringBuilder();
        StringBuilder result2Files = new StringBuilder();
        String[] number = new String[0];

        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            result1File.append(random.nextInt(100)).append(" ");
        }
        try {
            Files.write(pathIn, Collections.singleton(result1File));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file1.txt"))) {
            String st;
            while ((st = bufferedReader.readLine()) != null) {
                number = st.split(" ");
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("Некорректный входной файл");
        }
        for (int i = 0; i < number.length; i += 20) {
            String[] tempArray = Arrays.copyOfRange(number, i, i + 20);
            int summa = 0;
            for (String s : tempArray) {
                summa += Integer.parseInt(s);
            }
            double result = (double) summa / 20;
            result2Files.append(result).append(" ");
        }
        try {
            Files.write(pathOut, Collections.singleton(result2Files));
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file2 = new File("file2.txt");
        printResult(file2);
    }

    public static void printResult(File file) {
        try (Stream<String> stream = Files.lines(Paths.get(file.getAbsolutePath()))) {
            double res = stream.flatMap(a -> Stream.of(a.split(" ")))
                    .map(Double::valueOf)
                    .mapToDouble(Double::intValue)
                    .sum();
            System.out.println((int) res);
        } catch (NumberFormatException | IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}

