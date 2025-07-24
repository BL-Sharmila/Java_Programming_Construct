import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal (P): ");
        double P = sc.nextDouble();
        System.out.print("Enter Years (Y): ");
        double Y = sc.nextDouble();
        System.out.print("Enter Rate (R): ");
        double R = sc.nextDouble();

        double n = 12 * Y;
        double r = R / (12 * 100);
        double payment = (P * r) / (1 - Math.pow(1 + r, -n));

        System.out.println("Monthly payment: " + payment);
    }
}