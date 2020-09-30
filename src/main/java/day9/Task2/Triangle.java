package day9.Task2;

public class Triangle extends Figure {
    private int longSideA;
    private int longSideB;
    private int longSideC;

    public Triangle( int longSideA, int longSideB, int longSideC, String color) {
        super(color);
        this.longSideA = longSideA;
        this.longSideB = longSideB;
        this.longSideC = longSideC;
    }

    @Override
    public double area() {
        double p = (longSideA + longSideB + longSideC) / 2.0;
        return Math.sqrt(p * (p - longSideA) * (p - longSideB) * (p - longSideC));
    }

    @Override
    public double perimeter() {
        return longSideA + longSideB + longSideC;
    }
}
