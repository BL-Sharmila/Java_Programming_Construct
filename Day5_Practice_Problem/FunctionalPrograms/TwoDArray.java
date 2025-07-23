import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] array = new int[m][n];

        System.out.println("Enter " + (m * n) + " integers:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                array[i][j] = sc.nextInt();

        System.out.println("2D Array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}