import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year (>=1582): ");
        int y = sc.nextInt();

        if (y >= 1582 && ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))) 
            System.out.println("Leap Year");
        else 
            System.out.println("Not a Leap Year");
    }
}