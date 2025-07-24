import java.util.Scanner;

public class ToBinary {
    public static String toBinary(int n) {
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }
        while (binary.length() < 8) binary = "0" + binary;
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int num = sc.nextInt();
        String binary = toBinary(num);
        System.out.println("Binary: " + binary);
    }
}