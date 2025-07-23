import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        double harmonic = 0.0;

        if (n == 0) {
            System.out.println("N must not be zero.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            harmonic += 1.0 / i;
        }

        System.out.println("Nth Harmonic Number: " + harmonic);
    }
}
