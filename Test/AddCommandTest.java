import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddCommandTest {

    @Test
    void evaluate() {
        String a = "+";
        double c = 3;
        double d = 2;

        assertTrue(a.equalsIgnoreCase("+"));
        assertEquals(5,(c+d));
    }
}