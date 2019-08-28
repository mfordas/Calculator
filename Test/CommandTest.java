import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {
    private String a;
    private double c = 3;
    private double d = 2;

    AddCommand add = new AddCommand(c,d);
    MinusCommand minus = new MinusCommand(c,d);
    MultiplyCommand multiply = new MultiplyCommand(c,d);
    DivideCommand divide = new DivideCommand(c,d);

    @Test
    void evaluateAdd() {

        a = CalcCommand.ADD;
        assertTrue(a.equalsIgnoreCase("+"));
        assertEquals(5,add.evaluate(a,c,d));
    }

    @Test
    void evaluateMinus() {

        a = CalcCommand.MINUS;
        assertTrue(a.equalsIgnoreCase("-"));
        assertEquals(1,minus.evaluate(a,c,d));
    }

    @Test
    void evaluateMultiply() {

        a = CalcCommand.MULTIPLY;
        assertTrue(a.equalsIgnoreCase("*"));
        assertEquals(6,multiply.evaluate(a,c,d));
    }

    @Test
    void evaluateDivide() {

        a = CalcCommand.DIVIDE;
        assertTrue(a.equalsIgnoreCase("/"));
        assertEquals(1.5,divide.evaluate(a,c,d));
    }


}