package Practice.DSA.Array;

import Practice.APIs.foreach;
import java.util.Arrays;

class sec {
  static void funs(int a[][]) {

    for (int i = 0; i < a.length; i++) {
      int li = 0;
      int ri = (a[0].length) - 1;

      while (li < ri) {
        int temp = a[i][li];
        a[i][li] = a[i][ri];
        a[i][ri] = temp;

        li++;
        ri--;
      }
    }
  }
}

public class Rotation extends sec {

  public static void main(String[] args) {
    int arr[][] = {{2, 43, 2}, {4, 34, 2}, {4, 2, 5}};
    int a[][] = new int[3][3];
    System.out.println("Main Matrix is ");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[i][j] + " ");
        a[i][j] = arr[j][i];
      }
      System.out.println();
    }
    // System.out.println("Transpose Matrix : ");
    // for(int i=0;i<arr.length;i++)
    // {
    //     for(int j=0;j<arr.length;j++)
    //     {
    //         System.out.print(a[i][j]+" ");

    //     }
    //     System.out.println();

    // }

    // Rotation rt = new Rotation();
    // rt.funs(a);
    funs(a);
    System.out.println("Rotate matrix is ");
    for (var ans : a) {
      System.out.println(Arrays.toString(ans));
    }
    // for(int an[]:a)    //we can use Enhance for loop or foreach loop
    // {
    //     for(int an1 : an)
    //     {
    //     System.out.print(an1+" ");
    //     }
    //     System.out.println();
    // }
  }
}
