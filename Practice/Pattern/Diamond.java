package Practice.Pattern;

public class Diamond {
    public static void main(String[] args) {
        int n = 5;

        // Upper part of the diamond
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n - 1; i > 0; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}