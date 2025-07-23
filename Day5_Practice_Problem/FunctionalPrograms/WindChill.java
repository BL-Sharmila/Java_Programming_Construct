import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (t <= 50) and wind speed (v between 3 and 120): ");
        double t = sc.nextDouble();
        double v = sc.nextDouble();

        if (Math.abs(t) > 50 || v > 120 || v < 3) {
            System.out.println("Invalid inputs.");
            return;
        }

        double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Wind Chill: " + windChill);
    }
}