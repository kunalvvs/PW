package Practice.DSA.Recursion;

// Practice.DSA.Recursion;
import java.util.*;
import java.io.*;
class Factorial {
    int s=1;
    public static int fact(int n)
    {
        if(n==0 || n==1)
        {
           return 1;
        } 
        else
        {
           n=n * fact(n-1);
           
        }
        return n;
      
    }
    
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(fact(n));

    }
    // int s=1;
    // for(int i=1;i<=n;i++)
  
    // {
    //     s*=i;
    // }
    // System.out.println(s);


    }
