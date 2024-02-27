// package Practice.Exception_Handling;

import java.util.Scanner;

public  class Normal {
    public static void main(String[] args) {
    
      
  try(Scanner sc = new Scanner(System.in);){
      
       System.out.print("Enter the two number for passing exception : ");
        int a = sc.nextInt();
          int b = sc.nextInt();
        System.out.println(a/b);
  }
  catch(ArithmeticException e)
  {
    System.out.println(e);
  }
  catch(Exception e)
  {
    System.out.println("something went wrong i think this exception "+e);
  }
  finally{
    System.out.println("Execute successful");
  }
  
          
    }
}
