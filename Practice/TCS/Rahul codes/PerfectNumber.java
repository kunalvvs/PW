import java.util.Scanner;

public class PerfectNumber{

  public static boolean number(int num){
    int sum=0;

    for(int i=1;i<num;i++){
      if(num%i==0){
        sum=sum+i;
      }
    }
    if(sum==num){
      return true;
    }
    else{

      return false;
    }
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int num = sc.nextInt();
    System.out.println(number(num));
  }
}