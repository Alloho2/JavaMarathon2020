package day7;

import java.util.Objects;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        fuel = 0;
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void info() {
        System.out.printf("Изготовитель: %s" + ", год выпуска: %d" + ", длина: %d" + ", вес: %d" +
                ", количество топлива в баке: %d" +
                System.lineSeparator(), producer, year, length, weight, fuel);
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;
    }


    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length == airplane2.length) {
            System.out.println("Длины самолетов равны");
        } else if (airplane1.length > airplane2.length) {
            System.out.println("Длинна первого самолета " + airplane1.producer + " больше");
        } else System.out.println("Длинна второго самолета " + airplane2.producer + " больше");
    }
}
