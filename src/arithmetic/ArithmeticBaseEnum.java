package arithmetic;

import java.util.Scanner;


public enum ArithmeticOperation {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE
}

public class ArithmeticBaseEnum {
  public double x,y;
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
                throw new AssertionError("Unknown operations " + this);
        }
    }
}
