package day6;

public class Airplane {
    private String manufacturer;
    private int yearOfIssue;
    private int length;
    private int weight;
    private int fuelInTank;

    public Airplane(String manufacturer, int yearOfIssue, int length, int weight) {
        fuelInTank = 0;
        this.manufacturer = manufacturer;
        this.yearOfIssue = yearOfIssue;
        this.length = length;
        this.weight = weight;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void info() {
        System.out.printf("Изготовитель: %s" + ", год выпуска: %d" + ", длинна %d" + ", вес: %d" +
                ", количество топлива в баке: %d" +
                System.lineSeparator(), manufacturer, yearOfIssue, length, weight, fuelInTank);
    }

    public void fillUp(int fuel) {
        fuelInTank += fuel;
    }
}
