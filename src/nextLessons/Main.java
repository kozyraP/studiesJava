package nextLessons;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String message1 = "(String) Your result is: ";
        StringBuilder message2 = new StringBuilder("(StringBuilder) Your result is: ");
        try {
            String result = message1 + calculator.divide(6, 2);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            String result = message1 + calculator.divide(6, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            StringBuilder result2 = new StringBuilder(message2);
            result2.append(calculator.root(6));
            System.out.println(result2.toString());
        } catch (Exception e) {
            StringBuilder anotherStringBuilder = new StringBuilder("Something went wrong, error is: ");
            anotherStringBuilder.append(e.getMessage());
            System.out.println(anotherStringBuilder);
        }
        try {
            StringBuilder result3 = new StringBuilder(message2);
            result3.append(calculator.root(-6));
            System.out.println(result3.toString());
        } catch (Exception e) {
            StringBuilder anotherStringBuilder = new StringBuilder("Something went wrong, error is: ");
            anotherStringBuilder.append(e.getMessage());
            System.out.println(anotherStringBuilder);
        }
    }
}
