import java.util.Scanner;

public class DayOfWeek {
    public static int calculateDayOfWeek(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + 31 * m0 / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day, month, year: ");
        int d = sc.nextInt(), m = sc.nextInt(), y = sc.nextInt();
        int day = calculateDayOfWeek(d, m, y);
        System.out.println("Day of Week (0=Sun..6=Sat): " + day);
    }
}