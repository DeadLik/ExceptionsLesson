package homeW3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MiniCalculator calculator = new MiniCalculator();

        double result1 = calculator.add(5, 3);
        System.out.println("Result: " + result1);

        double result2 = calculator.divide(10, 0);
        System.out.println("Result: " + result2);

        List<String> history = calculator.getHistory();
        System.out.println("Calculation History:");
        for (String operation : history) {
            System.out.println(operation);
        }
    }
}
