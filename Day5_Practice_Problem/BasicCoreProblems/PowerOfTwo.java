import java.util.Scanner;

class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter power value N (0 <= N < 31): ");
        int n = sc.nextInt();

        if (n < 0 || n >= 31) {
            System.out.println("Invalid input. N must be between 0 and 30.");
            return;
        }

        for (int i = 0; i <= n; i++) {
            System.out.println("2^" + i + " = " + (1 << i));
        }
    }
}
