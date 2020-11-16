package second;

public class Main {
    static void performAllCalculationAndPrint(Figure figure) {
        System.out.println("Perimeter: " + figure.calculatePerimeter());
        System.out.println("Area: " + figure.calculateArea());
    }

    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("-Square: ");
        performAllCalculationAndPrint(square);

        Square rectangle = new Square(4, 6.75);
        System.out.println("-Rectangle: ");
        performAllCalculationAndPrint(rectangle);

        Rhombus rhombus = new Rhombus(7.211, 8, 12);
        System.out.println("-Rhombus: ");
        performAllCalculationAndPrint(rhombus);

        Triangle triangle = new Triangle(4, 5, 6);
        System.out.println("-Triangle: ");
        performAllCalculationAndPrint(triangle);
    }
}
