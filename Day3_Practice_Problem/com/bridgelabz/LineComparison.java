package com.bridgelabz;
import java.util.Scanner;

public class LineComparison {

    public static double calculateLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // UC1: Length of Line
        System.out.println("Enter coordinates for Line 1 (x1 y1 x2 y2): ");
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        double length1 = calculateLength(x1, y1, x2, y2);
        System.out.println("Length of Line 1: " + length1);

        // UC2: Equality of Lines
        System.out.println("Enter coordinates for Line 2 (x1 y1 x2 y2): ");
        int a1 = sc.nextInt(), b1 = sc.nextInt(), a2 = sc.nextInt(), b2 = sc.nextInt();
        double length2 = calculateLength(a1, b1, a2, b2);
        System.out.println("Length of Line 2: " + length2);

        if (Double.compare(length1, length2) == 0)
            System.out.println("UC2: Lines are Equal");
        else
            System.out.println("UC2: Lines are NOT Equal");

        // UC3: Compare Lengths
        if (Double.compare(length1, length2) > 0)
            System.out.println("UC3: Line 1 is longer");
        else if (Double.compare(length1, length2) < 0)
            System.out.println("UC3: Line 2 is longer");
        else
            System.out.println("UC3: Both lines are equal");
    }
}
