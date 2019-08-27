import java.util.Scanner;


public class Main {
    public static void main (String[] args){
        System.out.println("Podaj składniki działania");

        double numOne = readNumber();
        double numTwo = readNumber();

        System.out.println("Podaj działanie jakie chcesz wykonać: + - * /");

        String action = readAction();

        while(!CalcCommand.RESET.equalsIgnoreCase(action)){
            if((Double.compare(numTwo, 0)==0) && CalcCommand.DIVIDE.equals(action)){
                System.out.println("Dzielenie przez 0, działanie niemożliwe. Kalkulator wyłączony");
                System.exit(1);
            }

            CalcCommand command;

            switch(action){
                case CalcCommand.ADD:
                    command = new AddCommand(numOne, numTwo);
                    break;
                case CalcCommand.MINUS:
                    command = new MinusCommand(numOne, numTwo);
                    break;
                case CalcCommand.MULTIPLY:
                    command = new MultiplyCommand(numOne, numTwo);
                    break;
                case CalcCommand.DIVIDE:
                    command = new DivideCommand(numOne, numTwo);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + action);
            }

            double result = command.evaluate(action, numOne, numTwo);

            System.out.println("Wynik to:" + result);
            System.out.println("Podaj kolejne działanie:");


            action = readAction();

            if(!CalcCommand.RESET.equalsIgnoreCase(action)){
                System.out.println("Podaj kolejną liczbę do działania:");
                numOne = result;
                numTwo = readNumber();


            }


        }

        System.out.println("Kalkulator wyłączony");



    }
    private static double readNumber() {
        return new Scanner(System.in).nextDouble();
    }

    private static String readAction() {
        return new Scanner(System.in).nextLine();
    }

}
