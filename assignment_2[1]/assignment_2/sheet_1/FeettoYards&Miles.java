import java.util.Scanner;

class DistanceConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet = sc.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println(feet + " feet = " + yards + " yards and " + miles + " miles");
    }
}