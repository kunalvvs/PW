public class Pascal {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for Pascal's Triangle
        printPascalsTriangle(rows);
    }

    public static void printPascalsTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            printSpaces(rows - i - 1);
            printRow(i);
            System.out.println();
        }
    }

    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    public static void printRow(int rowNumber) {
        int number = 1;
        for (int j = 0; j <= rowNumber; j++) {
            System.out.print(number + " ");
            number = number * (rowNumber - j) / (j + 1);
        }
    }
}