package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2002, 150, 5000);
        airplane.fillUp(500);
        airplane.setYearOfIssue(2010);
        airplane.setLength(250);
        airplane.fillUp(200);
        airplane.info();
    }
}
