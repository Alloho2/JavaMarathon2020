package day6;

public class Teacher {
    private String name;
    private String object;

    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }

    public void evaluate(Student student, int mark) {
        String value;
        if (mark < 2 || mark > 5) {
            System.out.println("Неправильная оценка");
        } else {
            switch (mark) {
                case 2:
                    value = "неудовлетворительно";
                    break;
                case 3:
                    value = "удовлетворительно";
                    break;
                case 4:
                    value = "хорошо";
                    break;
                case 5:
                    value = "отлично";
                    break;
                default:
                    value = " ";
            }
            System.out.printf("Преподаватель %s" + " оценил студента с именем %s"
                    + " по предмету %s" + " на оценку %s." +
                    System.lineSeparator(), name, student.getName(), object, value);
        }
    }
}
