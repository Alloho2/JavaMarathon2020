package day14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws MyException {
        File file = new File("people.txt");
        System.out.println(Task2.parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) throws MyException {
        List<String> result = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String st = bufferedReader.readLine();

            while (st != null) {
                int i = Integer.parseInt(st.substring(st.indexOf(" ") + 1));
                if (i < 0) {
                    throw new MyException("В файле содержится отрицательный возраст");
                } else {
                    result.add(st);
                    st = bufferedReader.readLine();
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberFormatException | IOException e) {
            System.out.println("Некорректный входной файл");
        }
        return result;
    }
}



