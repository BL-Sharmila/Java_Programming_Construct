import java.util.Scanner;

public class VendingMachine {
    static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};
    static int total = 0;

    public static void countNotes(int amount) {
        for (int note : notes) {
            if (amount >= note) {
                int count = amount / note;
                amount = amount % note;
                total += count;
                System.out.println(note + " Rs notes: " + count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        countNotes(amount);
        System.out.println("Total notes needed: " + total);
    }
}