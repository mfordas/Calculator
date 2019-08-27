public interface CalcCommand {
    public double evaluate(String a, double c, double d);
    public static final String ADD = "+";
    public static final String MINUS = "-";
    public static final String MULTIPLY = "*";
    public static final String DIVIDE = "/";
    public static final String RESET = "C";

}
