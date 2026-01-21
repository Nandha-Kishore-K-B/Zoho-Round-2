import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int spaces, stars;

            if (i <= N / 2) {
                spaces = N / 2 - i;
                stars = 2 * i + 1;
            } else {
                int mirror = N - 1 - i;
                spaces = N / 2 - mirror;
                stars = 2 * mirror + 1;
            }

            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
