import java.util.Scanner;

public class Binary {
    public static String toBinary(int n) {
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }
        while (binary.length() < 8) binary = "0" + binary;
        return binary;
    }

    public static int swapNibbles(int n) {
        return ((n & 0x0F) << 4 | (n & 0xF0) >> 4);
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0–255): ");
        int num = sc.nextInt();

        String binary = toBinary(num);
        int swapped = swapNibbles(num);
        System.out.println("Original Binary: " + binary);
        System.out.println("After Swapping Nibbles: " + toBinary(swapped));
        System.out.println("Decimal After Swap: " + swapped);
        System.out.println("Is Power of 2: " + isPowerOfTwo(swapped));
    }
}