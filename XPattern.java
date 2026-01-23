import java.util.Scanner;
public class XPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Word: ");
        String str = scanner.next();
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        int len = str.length();

        for (int i = 0; i < n; i++) {
            // Calculate bouncing index with wrapping
            int raw_k = (i <= n / 2) ? i : n - 1 - i;
            int k = raw_k % len;

            for (int j = 0; j < n; j++) {
                if (j == i || j == n - 1 - i) {
                    if (j <= n / 2) {
                        System.out.print(str.charAt(k));
                    } else {
                        System.out.print(str.charAt(len - 1 - k));
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}