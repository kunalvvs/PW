package Practice.DSA.Recursion;

import java.util.*;

public class Fibbnacci {
     public static int fibb(int n)
    
        {
         if(n==0 || n==1)
         {
            return n;
         }
         else
         {
            int  re= fibb(n-1)+fibb(n-2);
            //  System.out.println(re);
              return re;
         }
        
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        double n = sc.nextInt();
       
    //    System.out.println(fibb(n));
        
    // for (int i = 0; i < 3; i++) {
    //      s*=n;
    // }
    
   double s=Math.pow(n, 3);
    System.out.println(s);

    }
}
