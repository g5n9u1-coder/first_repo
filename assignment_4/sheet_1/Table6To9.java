public class Table6To9 {
    public static void main(String[] args) {
        for (int num = 6; num <= 9; num++) {
            System.out.println("\nMultiplication Table of " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }
        }
    }
}

