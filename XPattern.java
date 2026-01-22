import java.util.Scanner;
public class XPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Word: ");
        String str = scanner.next();
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        int len = str.length();

        // 1. Loop through rows
        for (int i = 0; i < n; i++) {

            // Calculate 'k' (The Index that bounces: 0, 1, 2, 3, 2, 1, 0)
            int k = (i <= n / 2) ? i : n - 1 - i;

            // 2. Loop through columns
            for (int j = 0; j < n; j++) {

                // Check if the current cell is part of the 'X' (Main or Anti-Diagonal)
                if (j == i || j == n - 1 - i) {

                    // SIMPLIFIED LOGIC:
                    // If we are on the Left side or Center: print str[k]
                    // If we are on the Right side: print str[len - 1 - k]
                    if (j <= n / 2) {
                        System.out.print(str.charAt(k));
                    } else {
                        System.out.print(str.charAt(len - 1 - k));
                    }

                } else {
                    System.out.print(" "); // Print space for non-diagonal spots
                }
            }
            System.out.println(); // New line after each row
        }
        scanner.close();
    }
}