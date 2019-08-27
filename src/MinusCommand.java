public class MinusCommand implements CalcCommand{
    public MinusCommand(double c, double d) {
    }
    @Override
    public double evaluate(String a, double c, double d) {
        return c-d;
    }
}
