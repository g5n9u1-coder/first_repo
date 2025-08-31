import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter operator (+ - * /): ");
        String op = sc.next();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        switch (op) {
            case "+": System.out.println("Result = " + (a + b)); break;
            case "-": System.out.println("Result = " + (a - b)); break;
            case "*": System.out.println("Result = " + (a * b)); break;
            case "/": 
                if (b != 0) System.out.println("Result = " + (a / b));
                else System.out.println("Division by zero not allowed");
                break;
            default: System.out.println("Invalid operator");
        }
    }
}
