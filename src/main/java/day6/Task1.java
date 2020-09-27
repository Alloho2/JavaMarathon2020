package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Красный");
        car.setYear(2017);
        car.setModel("NISSAN X-TRAIL");
        car.info();
        System.out.println("Разница лет: " + car.yearDifference(2005));

        Motorbike motorbike = new Motorbike("Yamaha", 2020, "black");
        motorbike.info();
        System.out.println("Разница лет: " + motorbike.yearDifference(2006));
    }
}
