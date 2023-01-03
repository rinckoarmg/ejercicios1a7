package code.dgamboa.bootcamp;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeometryTest {
    @Test
    public void hypotenuseTest() {
        assertEquals(5.0, Geometry.hypotenuse(4.0, 3.0));
    }
}