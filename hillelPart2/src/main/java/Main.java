import homework14.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(args[0], args[1], args[2]));
    }

}