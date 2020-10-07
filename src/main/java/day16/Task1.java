package day16;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("num.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        if (!file.getAbsolutePath().endsWith(".txt")) {
            System.out.println("Формат файла не верный");
        } else {
            try (Stream<String> stream = Files.lines(Paths.get(file.getAbsolutePath()))) {

                OptionalDouble res = stream.flatMap(a -> Stream.of(a.split(" ")))
                        .map(Double::valueOf)
                        .mapToDouble(Double::intValue)
                        .average();
                double minRes = BigDecimal.valueOf(res.getAsDouble()).setScale(3, RoundingMode.UP).doubleValue();
                System.out.printf("%s" + " --> " + "%.3f", res.getAsDouble(), minRes);
            } catch (NumberFormatException | IOException e) {
                System.out.println("Некорректный входной файл");
            }
        }
    }
}
