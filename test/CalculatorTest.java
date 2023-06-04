import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private TestCase Assertion;

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        double v1 = 5.0;
        double v2 = 2.5;
        double expected = 7.5;
        double actual = calculator.add(v1, v2);
        Assertion.assertEquals(expected, actual);
    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();
        double v1 = 5.0;
        double v2 = 2.5;
        double expected = 2.5;
        double actual = calculator.subtract(v1, v2);
        Assertion.assertEquals(expected, actual);
    }

    @Test
    public void multiply() {
        Calculator calculator = new Calculator();
        double v1 = 5.0;
        double v2 = 2.5;
        double expected = 12.5;
        double actual = calculator.multiply(v1, v2);
        Assertion.assertEquals(expected, actual);
    }

    @Test
    public void divide() {
        Calculator calculator = new Calculator();
        double v1 = 5.0;
        double v2 = 5.0;
        double expected = 1;
        double actual = calculator.divide(v1, v2);
        Assertion.assertEquals(expected, actual);
    }
}