import java.util.*;
// import java.*;
public class NaturalNumberDivisors{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number: ");
    int num = sc.nextInt();

    for(int i=1;i<=num;i++){
      if(num%i==0){
        System.out.println(i);
        // System.out.print(" "+ i);
      }
    }


  }
}