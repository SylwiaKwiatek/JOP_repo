import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double firstNumber, secondNumber, result = 0.0000000001;
        String operation;
        boolean continueCalculating = true;
        boolean choseOperation = false;
        boolean choseContinueCalculating = false;

        do {
            if (result == 0.0000000001) {
                System.out.println("Podaj pierwszą liczbę");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Nieprawidłowe dane! Wpisz liczbę.");
                    scanner.next();
                }
                firstNumber = scanner.nextDouble();
            } else {
                System.out.println("Poprzedni wynik: " + result);
                firstNumber = result;
            }
            System.out.println("Podaj drugą liczbę");
            while (!scanner.hasNextDouble()) {
                System.out.println("Nieprawidłowe dane! Wpisz liczbę.");
                scanner.next();
            }
            secondNumber = scanner.nextDouble();

            while (!choseOperation) {
                System.out.println("Wybierz operację dodawania (+), odejmowania (-), mnożenia (*) lub dzielenia (/):");
                operation = scanner.next();

                switch (operation) {
                    case "+":
                        result = firstNumber + secondNumber;
                        System.out.println("Wynik dodawania: " + result);
                        choseOperation = true;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        System.out.println("Wynik odejmowania: " + result);
                        choseOperation = true;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        System.out.println("Wynik mnożenia: " + result);
                        choseOperation = true;
                        break;
                    case "/":
                        while (secondNumber == 0) {
                            System.out.println("Pamiętaj cholero, że nie można dzielić przez zero!");
                            System.out.println("Podaj drugą liczbę");
                            while (!scanner.hasNextDouble()) {
                                System.out.println("Nieprawidłowe dane! Wpisz liczbę.");
                                scanner.next();
                            }
                            secondNumber = scanner.nextDouble();
                        }
                        result = firstNumber / secondNumber;
                        System.out.println("Wynik dzielenia: " + result);
                        choseOperation = true;
                        break;
                    default:
                        System.out.println("Wybrano nieprawidłową operację.");
                }
            }
            choseOperation = false;

            while (!choseContinueCalculating) {
                System.out.println("Czy chcesz kontynuować obliczenia na uzyskanej liczbie? (tak/nie)");
                String answer = scanner.next();
                if (answer.equals("tak")) {
                    continueCalculating = true;
                    choseContinueCalculating = true;
                } else if (answer.equals("nie")) {
                    continueCalculating = false;
                    choseContinueCalculating = true;
                } else {
                    System.out.println("Wybrano nieprawidłową odpowiedź.");
                }
            }
            choseContinueCalculating = false;

        } while (continueCalculating);

        System.out.println("Wynik końcowy: " + result);
        scanner.close();
    }
}
