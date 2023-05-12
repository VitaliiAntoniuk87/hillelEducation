package homework14;

public class Main {
    public static void main(String[] args) {

        System.out.println(calculator(args[0], args[1], args[2]));
    }

    public static double calculator(String firstArgument, String operator, String secondArgument) {
        double result = 0;
        if (operator.equals(":") && secondArgument.equals("0")) {
            System.err.println("can't divide by zero");
        } else {
            try {
                switch (operator) {
                    case "+" -> result = Double.parseDouble(firstArgument) + Double.parseDouble(secondArgument);
                    case "-" -> result = Double.parseDouble(firstArgument) - Double.parseDouble(secondArgument);
                    case ":" -> result = Double.parseDouble(firstArgument) / Double.parseDouble(secondArgument);
                    case "x" -> result = Double.parseDouble(firstArgument) * Double.parseDouble(secondArgument);
                }
            } catch (NumberFormatException e) {
                System.err.println("String should contains float, double or integer");
            } catch (NullPointerException e) {
                System.err.println("Argument can't be empty");
            }
        }
        return result;
    }
}