import java.util.Scanner;

public class StopwatchProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press ENTER to start stopwatch...");
        sc.nextLine();
        long start = System.currentTimeMillis();

        System.out.println("Press ENTER to stop stopwatch...");
        sc.nextLine();
        long end = System.currentTimeMillis();

        System.out.println("Elapsed time: " + (end - start) + " milliseconds");
    }
}