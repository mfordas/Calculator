public class AddCommand implements CalcCommand{
    public AddCommand(double c, double d) {
    }
    @Override
    public double evaluate(String a, double c, double d) {
        return c+d;

    }
}
