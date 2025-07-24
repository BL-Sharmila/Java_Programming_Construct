import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of distinct coupons: ");
        int n = sc.nextInt();

        HashSet<Integer> coupons = new HashSet<>();
        Random rand = new Random();
        int count = 0;

        while (coupons.size() < n) {
            int newCoupon = rand.nextInt(n);
            coupons.add(newCoupon);
            count++;
        }

        System.out.println("Total random numbers generated to get all coupons: " + count);
    }
}