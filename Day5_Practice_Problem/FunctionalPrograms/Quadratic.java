import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;
        if (delta >= 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Roots: " + root1 + " , " + root2);
        } else {
            System.out.println("Roots are imaginary.");
        }
    }
}