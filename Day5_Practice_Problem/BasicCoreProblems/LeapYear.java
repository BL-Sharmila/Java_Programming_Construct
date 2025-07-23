import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit year: ");
        int year = sc.nextInt();
        if (year >= 1000 && year <= 9999) {
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            System.out.println(year + (isLeap ? " is a Leap Year" : " is NOT a Leap Year"));
        } else {
            System.out.println("Invalid Year! Must be 4 digits.");
        }
    }
}
