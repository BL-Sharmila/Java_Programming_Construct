import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Celsius to Fahrenheit 2: Fahrenheit to Celsius");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double c = sc.nextDouble();
            System.out.println("Fahrenheit: " + ((c * 9 / 5) + 32));
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = sc.nextDouble();
            System.out.println("Celsius: " + ((f - 32) * 5 / 9));
        } else {
            System.out.println("Invalid choice");
        }
    }
}