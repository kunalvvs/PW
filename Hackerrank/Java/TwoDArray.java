package Hackerrank.Java;

import java.util.Scanner;

public class TwoDArray {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int arr[][] = new int[6][6];

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    int sum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 3; i < 6; i++) {
      for (int j = 2; j < 5; j++) {

        sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] +
              arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
        maxSum = Math.max(maxSum, sum);
      }
    }
    System.out.println(maxSum);
  }
}
