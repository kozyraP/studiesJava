package second;

public class Rhombus implements Figure {
    private double a;
    private double d1;
    private double d2;

    public Rhombus(double a, double d1, double d2) {
        this.a = a;
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public double calculateArea() {
        return d1 * d2 / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }
}
