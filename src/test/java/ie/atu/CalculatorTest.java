package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    public void setup(){
        calc = new Calculator();
    }

    @Test
    public void testAdd_Success(){
        assertEquals(20, calc.add(16,4));
    }
    @Test
    public void testSub_Success(){
        assertEquals(12, calc.subtract(16,4));
    }
    @Test
    public void testAdd_failure(){
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.add(Integer.MAX_VALUE,1));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());
    }
    @Test
    public void testSub_failure(){
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.subtract(Integer.MAX_VALUE,1));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());
    }
    @Test
    public void testMultiply_Success() { assertEquals(64, calc.multiply(16, 4));
    }
    @Test
    public void testMultiply_failure() {
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.multiply(Integer.MAX_VALUE, 2));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());

    }
    @Test
    public void testDivision_Success() { assertEquals(4, calc.division(16, 4));
    }
    @Test
    public void testDivision_failure() {
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.division(Integer.MAX_VALUE, 0));
        assertEquals("Cannot divide by zero", ex.getMessage());

    }

}


