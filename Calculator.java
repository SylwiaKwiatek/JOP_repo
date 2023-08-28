import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double result = getValidDoubleInput(scanner);

        String answer = "y";
        while (answer.equals("y")) {
            System.out.println("Enter second number: ");
            double secondNumber = getValidDoubleInput(scanner);

            System.out.println("Choose an operation: addition (+), subtraction (-), multiplication (*) or division (/): ");
            char operation = getValidOperation(scanner);

            switch (operation) {
                case '+':
                    result = add(result, secondNumber);
                    System.out.println(result);
                    break;
                case '-':
                    result = subtract(result, secondNumber);
                    System.out.println(result);
                    break;
                case '*':
                    result = multiply(result, secondNumber);
                    System.out.println(result);
                    break;
                case '/':
                    while (secondNumber == 0) {
                        System.out.println("Remember that division by zero is not allowed!");
                        System.out.println("Enter the second number: ");
                        secondNumber = getValidDoubleInput(scanner);
                    }
                    result = divide(result, secondNumber);
                    System.out.println(result);
                    break;
            }

            System.out.println("Do you want to continue calculations on the obtained number? (y/n)");
            answer = scanner.next();
            while (!answer.equals("y") && (!answer.equals("n"))) {
                System.out.println("Invalid answer selected.");
                answer = scanner.next();
            }
        }

        System.out.println("Final result: " + result);
    }

    public static double getValidDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a number.");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static char getValidOperation(Scanner scanner) {
        char operation = scanner.next().charAt(0);
        while (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            System.out.println("Invalid operation selected. Please choose a valid operation: addition (+), subtraction (-), multiplication (*) or division (/)");
            operation = scanner.next().charAt(0);
        }
        return operation;
    }

    public static double add(double v1, double v2) {
        return v1 + v2;
    }

    public static double subtract(double v1, double v2) {
        return v1 - v2;
    }

    public static double multiply(double v1, double v2) {
        return v1 * v2;
    }

    public static double divide(double v1, double v2) {
        return v1 / v2;
    }
}
