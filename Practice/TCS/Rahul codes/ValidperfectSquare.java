import java.util.Scanner;

public class ValidperfectSquare{

  public static boolean perfectSquare(int num){
    if(num<0){
      return false;
    }
    if(num ==0 || num==1){
      return true;
    }
    long start = 1;
    long end = num/2;

    while(start<=end){
      long mid = start+(end-start)/2;
      long square = mid*mid;

      if(square==num){
        return true;
      }else if(square<num){
        start = mid+1;
      }else{
        end = mid-1;
      }

    }
    return false;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int num = sc.nextInt();
    // sc.close();

    if(perfectSquare(num)){
      System.out.println("it is a perfect square");
    }
    else{
      System.out.println("not a perfect square");
    }

    
  }
}