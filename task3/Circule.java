package task3;

public class Circule implements Shape {
    private double radius;

    public Circule(double radius) {
    this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
