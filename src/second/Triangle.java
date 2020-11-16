package second;

public class Triangle implements Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        } else
            return -1;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
