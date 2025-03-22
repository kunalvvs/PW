package Practice.Pattern;

public class Hourglass {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i > 0; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                if (j == 0 || j == (2 * i - 2) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                if (j == 0 || j == (2 * i - 2) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}