package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2002, 900, 200);
        Airplane airplane2 = new Airplane("Airbus", 2006, 700, 200);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}