package arithmetic;

import java.util.Scanner;

enum ArithmeticOperation {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE
}

public class ArithmeticBase {
    public double calculate(double x, double y, ArithmeticOperation operation) {
        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operation " + operation);
        }
    }
}
