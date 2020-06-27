package travis.ci.cd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(3, calculator.add(1, 2), 0);
    }

    @Test
    public void multiply() {
        assertEquals(4, calculator.multiply(2, 2), 0);
    }

    @Test
    public void divide() {
    }

    @Test
    public void subtract() {
    }
}