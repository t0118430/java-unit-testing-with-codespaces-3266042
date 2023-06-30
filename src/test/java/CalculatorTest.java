import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 3;

        int actual = calculator.add(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int expected = 3;

        int actual = calculator.subtract(5, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 6;

        int actual = calculator.multiply(2, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int expected = 2;

        int actual = calculator.divide(6, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testIsEven() {
        boolean actual = calculator.isEven(2);

        assertTrue(actual);
    }

    @Test
    public void testIsOdd() {
        boolean actual = calculator.isEven(3);

        assertFalse(actual);
    }

    @Test
    public void testIncrementArray() {
      int[] i = new int[]{2,3,4};

      int[] w = calculator.incrementArray(new int[]{1,2,3});

      assertArrayEquals(i, w);
    }

    @Test
    public void testDivideByZero() {
      Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));

      String expected = "Ints cannot be divided by zero";

      String actual = exception.getMessage();

      assertEquals(expected, actual);
    }
}
