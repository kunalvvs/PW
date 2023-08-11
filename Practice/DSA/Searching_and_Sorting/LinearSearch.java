package Practice.DSA.Searching_and_Sorting;

import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    System.out.println("Enter number of element ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter element to find ");
    int x = sc.nextInt();
    int inx = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] == x) {
        inx = i;
      }
    }
    if (inx == -1) {
      System.out.println("Given number is not matching");

    } else {
      System.out.println("Number is found : " + inx);
    }
  }
}
