import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        double v1 = 5.0;
        double v2 = 2.5;
        double expectedResult = 7.5;
        double result = calculator.add(v1, v2);
        if (expectedResult == result) {
            System.out.println("Test passed: add(" + v1 + ", " + v2 + ") = " + result);
        } else {
            System.out.println("Test failed: add(" + v1 + ", " + v2 + ") expected " + expectedResult + " but got " + result);
        }
    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();
        double v1 = 5.0;
        double v2 = 2.5;
        double expectedResult = 2.5;
        double result = calculator.subtract(v1, v2);
        if (expectedResult == result) {
            System.out.println("Test passed: substract(" + v1 + ", " + v2 + ") = " + result);
        } else {
            System.out.println("Test failed: substract(" + v1 + ", " + v2 + ") expected " + expectedResult + " but got " + result);
        }
    }

    @Test
    public void multiply() {
        Calculator calculator = new Calculator();
        double v1 = 5.0;
        double v2 = 2.5;
        double expectedResult = 12.5;
        double result = calculator.multiply(v1, v2);
        if (expectedResult == result) {
            System.out.println("Test passed: multiply(" + v1 + ", " + v2 + ") = " + result);
        } else {
            System.out.println("Test failed: multiply(" + v1 + ", " + v2 + ") expected " + expectedResult + " but got " + result);
        }
    }

    @Test
    public void divide() {
        Calculator calculator = new Calculator();
        double v1 = 5.0;
        double v2 = 0;
        double expectedResult = 2.0;
        double result = calculator.divide(v1, v2);
        if (v2 == 0) {
            System.out.println("Remember that division by zero is not allowed!");
        } else if (expectedResult == result) {
            System.out.println("Test passed: divide(" + v1 + ", " + v2 + ") = " + result);
        } else {
            System.out.println("Test failed: divide(" + v1 + ", " + v2 + ") expected " + expectedResult + " but got " + result);
        }
    }
}