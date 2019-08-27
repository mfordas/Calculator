public class MultiplyCommand implements CalcCommand{
    public MultiplyCommand(double c, double d) {
    }
    @Override
    public double evaluate(String a, double c, double d) {
       return c*d;
    }
}
