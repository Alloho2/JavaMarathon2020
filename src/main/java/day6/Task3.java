package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Петров Петр Петрович", "Философия");
        Student student = new Student("Иванов Иван Иванович");
        teacher.evaluate(student, 4);
    }
}
