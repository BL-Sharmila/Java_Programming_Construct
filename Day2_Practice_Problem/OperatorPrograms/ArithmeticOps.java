import java.util.Scanner;

public class ArithmeticOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int op1 = a + b * c;
        int op2 = c + a / b;
        int op3 = a % b + c;
        int op4 = a * b + c;

        System.out.println("a + b * c = " + op1);
        System.out.println("c + a / b = " + op2);
        System.out.println("a % b + c = " + op3);
        System.out.println("a * b + c = " + op4);
    }
}
