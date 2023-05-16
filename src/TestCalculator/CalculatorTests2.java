package TestCalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTests2 {
    private final TestCalculator.Calculator2 calculator = new TestCalculator.Calculator2();

    @Test
    public void shouldReturn2When1Plus1() {
        assertEquals(2, calculator.add(1, 1));
    }
    @Test
    public void whenAssertingConditions_thenVerified() {
        assertTrue("10 lớn hơn 5", 10 > 5);
    }
    @Test
    public void whenAssertingConditions_thenVerifiedS() {
        assertFalse("5 không lớn hơn 10", 5 > 10);
    }

}
