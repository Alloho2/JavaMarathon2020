package day9.Task1;

public class Teacher extends Human {
    private String subjectName;

    public Teacher(String name, String objectName) {
        super(name);
        this.subjectName = objectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String objectName) {
        this.subjectName = objectName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + super.getName());
    }
}
