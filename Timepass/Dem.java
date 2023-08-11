import java.util.Scanner;

class Dem {
  public static void main(String args[]) {
    // for(;;)
    // {
    // System.out.print("Hacked  ");
    // }
    // while(true)
    // {
    //     System.out.println("Wer");
    // }
    Scanner sc = new Scanner(System.in);
    int a[] = new int[6];
    for (int i = 0; i < 5; i++) {

      a[i] = sc.nextInt();
    }
    for (int i = 0; i < 5; i++) {
      for (int j = i + 1; j < 5; j++) {
        if (a[i] > a[j]) {
          int t = a[i];
          a[i] = a[j];
          a[j] = t;
        }
      }
    }
    for (int i = 0; i < 5; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
