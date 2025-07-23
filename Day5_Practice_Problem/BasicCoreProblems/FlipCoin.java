import java.util.Scanner;
import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of flips: ");
        int flips = sc.nextInt();
        if (flips <= 0) {
            System.out.println("Number of flips must be positive.");
            return;
        }

        int heads = 0, tails = 0;
        Random rand = new Random();

        for (int i = 0; i < flips; i++) {
            if (rand.nextDouble() < 0.5)
                tails++;
            else
                heads++;
        }

        double headPercent = (heads * 100.0) / flips;
        double tailPercent = (tails * 100.0) / flips;

        System.out.println("Heads: " + headPercent + "%");
        System.out.println("Tails: " + tailPercent + "%");
    }
}
