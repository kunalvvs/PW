// import java.util.*;
import java.util.Scanner;

public class LeapYear {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter year");
    int year = sc.nextInt();

    if (year % 4 == 0 || year % 100 == 0) {
      System.out.println("given year is a leap year");
    } else {
      System.out.println("given year is not a leap year");
    }
  }
}