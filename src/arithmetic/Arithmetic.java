/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double x = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double y = sc.nextDouble();

        for (ArithmeticOperation operation : ArithmeticOperation.values()) {
            double result = r.calculate(x, y, operation);
            System.out.println(operation + " result: " + result);
        }
    }
}
