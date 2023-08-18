package Hackerrank.Java;
 import java.util.Scanner;
//Success Rate: 90.00% Max Score: 10 Difficulty: Easy
//Passed All Test Cases ✅✅
public class DiagonalDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the number of rows and columns in the square matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        // System.out.println("Enter the matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int result = diagonalDifference(matrix);
        // System.out.println("The absolute diagonal difference is: " + result);
        System.out.println(result);

        scanner.close();
    }

    public static int diagonalDifference(int[][] arr) {
        int n = arr.length;
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += arr[i][i];
            secondarySum += arr[i][n - 1 - i];
        }

        return Math.abs(primarySum - secondarySum);
    }
}
 
