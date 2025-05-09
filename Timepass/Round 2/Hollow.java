// package Practice.Pattern;

public class Hollow {
    public static void main(String[] args) {
        int n = 10;
        printHollowTriangle(n);
    }

    public static void printHollowTriangle(int n) {
        for (int i = n; i >= 0; i--) {
            printSpaces(n - i - 1);
            printHollowRow(i);
            System.out.println();
        }
    }

    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    public static void printHollowRow(int rowLength) {
        for (int j = 0; j <= rowLength; j++) {
            if (j == 0 || j == rowLength || rowLength == 10) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
    }
}