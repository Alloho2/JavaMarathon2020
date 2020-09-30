package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Иванов Иван", "Группа А");
        Teacher teacher = new Teacher("Петров Петр", "Физика");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();

    }
}
