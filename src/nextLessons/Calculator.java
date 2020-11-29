package nextLessons;

public class Calculator {
    class DivideByZeroException extends RuntimeException {
        public DivideByZeroException() {

        }

        public DivideByZeroException(String s) {
            super(s);
        }
    }

    class RootFromNegativeException extends ArithmeticException {
        public RootFromNegativeException() {
        }

        public RootFromNegativeException(String s) {
            super(s);
        }
    }

    public double divide(double a, double b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Dividing by zero!");
        }
        return a / b;
    }

    public double root(double a) throws RootFromNegativeException {
        if (a < 0) {
            throw new RootFromNegativeException("Negative number!");
        }

        return Math.sqrt(a);
    }
}
