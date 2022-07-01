import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest    {
    Calculator calculator = new Calculator();
    @Test
    void add() {
        double actual = calculator.add(10,5);
        double expected= 15;
        assertEquals(expected,actual,0.001);
    }

    @Test
    void subtract() {
        double expected = 5;
        double actual = calculator.subtract(10.0123,5.0123);

        assertEquals(expected,actual);
    }

    @Test
    void multiply() {
        double expected = 30;
        double actual = calculator.multiply(3,10);
        assertEquals(expected,actual);
    }
    @Test
    void divide() {
        double expected = 4;
        double actual= calculator.divide(8,2);
        assertEquals(expected,actual,0.001);
    }

    @Test
    void sqr() {
        assertEquals(4,calculator.sqr(2),0.001);
    }
}