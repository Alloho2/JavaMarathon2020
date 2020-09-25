package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("YAMAHA", 2020, "Черный");

        System.out.format("Марка мотоцикла: %s, " + "Год выпуска: %d, " + "Цвет: %s ", motorbike.getModel(), motorbike.getYear(), motorbike.getColor());
    }
}
