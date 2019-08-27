public class DivideCommand implements CalcCommand{
    public DivideCommand(double c, double d) {
    }
    @Override
    public double evaluate(String a, double c, double d) {
        return c/d;
    }
}
