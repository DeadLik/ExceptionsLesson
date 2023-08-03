package homeW3;

import java.util.ArrayList;
import java.util.List;

public class MiniCalculator {
    private List<String> history;

    public MiniCalculator() {
        history = new ArrayList<>();
    }

    public double add(double num1, double num2) {
        double result = num1 + num2;
        history.add(num1 + " + " + num2 + " = " + result);
        return result;
    }

    public double subtract(double num1, double num2) {
        double result = num1 - num2;
        history.add(num1 + " - " + num2 + " = " + result);
        return result;
    }

    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        history.add(num1 + " * " + num2 + " = " + result);
        return result;
    }

    public double divide(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Нельзя делить на ноль");
        }
        double result = num1 / num2;
        history.add(num1 + " / " + num2 + " = " + result);
        return result;
    }

    public double power(double base, double exponent) {
        double result = Math.pow(base, exponent);
        history.add(base + " ^ " + exponent + " = " + result);
        return result;
    }

    public List<String> getHistory() {
        return history;
    }
}
