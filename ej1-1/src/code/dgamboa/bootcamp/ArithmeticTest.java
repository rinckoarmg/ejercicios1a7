package code.dgamboa.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {

    @Test
    void isMultipleTest() {
        assert(Arithmetic.isMultiple(4,2) == true);
        assertEquals(true, Arithmetic.isMultiple(4,2));
    }

    @Test
    void isEvenTest() {
        assertTrue(Arithmetic.isEven(2));
    }

    @Test
    void isOddTest() {
        assertTrue(Arithmetic.isOdd(3));
    }
}