package second;

public class Square implements Figure {
    private double a;
    private double b;

    //rectangle
    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Square(double a) {
        this.a = a;
        b = a;
    }

    @Override
    public double calculatePerimeter() {
        return a + a + b + b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
