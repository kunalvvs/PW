import java.util.Scanner;

public class AddDigits{
  public static int digit(int num){
    if(num==0){
      return 0;
    }
    if(num%9==0){
      return 9;
    }
    return num%9;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num= sc.nextInt();
    sc.close();
    System.out.println(digit(num));
  }
}