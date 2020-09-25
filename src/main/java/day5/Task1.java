package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Красный");
        car.setYear(2017);
        car.setModel("NISSAN X-TRAIL");

        System.out.format("Марка автомобиля: %s, " + "Год выпуска: %d, " + "Цвет: %s ", car.getModel(), car.getYear(), car.getColor());
    }
}
