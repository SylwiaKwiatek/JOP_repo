import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double secondNumber, result;
        String operation;
        String answer = "y";

        System.out.println("Enter first number: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a number.");
            scanner.next();
        }
        result = scanner.nextDouble();

        while (answer.equals("y")) {
            System.out.println("Enter second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
            secondNumber = scanner.nextDouble();

            System.out.println("Choose an operation: addition (+), subtraction (-), multiplication (*) or division (/): ");
            operation = scanner.next();

            switch (operation) {
                case "+":
                    System.out.println(result + " " + "+" + " " + secondNumber + " " + "=" + " " + (result += secondNumber));
                    break;
                case "-":
                    System.out.println(result + " " + "-" + " " + secondNumber + " " + "=" + " " + (result -= secondNumber));
                    break;
                case "*":
                    System.out.println(result + " " + "*" + " " + secondNumber + " " + "=" + " " + (result *= secondNumber));
                    break;
                case "/":
                    while (secondNumber == 0) {
                        System.out.println("Remember that division by zero is not allowed!");
                        System.out.println("Enter the second number: ");
                        while (!scanner.hasNextDouble()) {
                            System.out.println("Invalid input! Please enter a number.");
                            scanner.next();
                        }
                        secondNumber = scanner.nextDouble();
                    }
                    System.out.println(result + " " + "/" + " " + secondNumber + " " + "=" + " " + (result /= secondNumber));
                    break;
                default:
                    System.out.println("Invalid operation selected.");
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

    public double add(double v1, double v2) {
        return v1 + v2;
    }

    public double substract(double v1, double v2) {
        return v1 - v2;
    }

    public double multiply(double v1, double v2) {
        return v1 * v2;
    }

    public double divide(double v1, double v2) {
        return v1 / v2;
    }
}
