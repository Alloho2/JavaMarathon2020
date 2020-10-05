package day14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) throws MyException {
        File file = new File("people.txt");
        System.out.println(Task3.parseFileToStringList(file));
    }

    public static List<Person> parseFileToStringList(File file) throws MyException {
        List<Person> result = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String st = bufferedReader.readLine();

            while (st != null) {
                int i = Integer.parseInt(st.substring(st.indexOf(" ") + 1));
                if (i < 0) {
                    throw new MyException("В файле содержится отрицательный возраст");
                } else {

                    result.add(new Person(st.substring(0, st.indexOf(" ")), i));
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