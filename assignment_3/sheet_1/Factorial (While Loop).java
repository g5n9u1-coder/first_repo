import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            long fact = 1;
            int i = 1;
            while (i <= n) fact *= i++;
            System.out.println("Factorial = " + fact);
        } else {
            System.out.println("Not a valid input");
        }
    }
}