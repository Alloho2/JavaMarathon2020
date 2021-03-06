package day6;

public class Motorbike {
    private String color;
    private int year;
    private String model;

    public Motorbike(String model, int year, String color) {
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int newYear) {
        return getYear() - newYear;
    }
}