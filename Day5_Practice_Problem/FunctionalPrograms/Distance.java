import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        double distance = Math.sqrt(x * x + y * y);
        System.out.println("Euclidean distance from (0,0) to (" + x + "," + y + ") is " + distance);
    }
}