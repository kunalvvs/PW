package Practice.DSA.Recursion;

import java.util.Scanner;

public class powerOfNum {
    public static int power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
    
        return x* power(x, n-1);

    }
    public static int Optimized(int x,int n)
    {
       
        if(n==0)
        {
            return 1;
        }
        
       
        int halfPower = Optimized(x, n/2);
        int hp = halfPower*halfPower;
        // if (n < 0) {
        //     x = 1 / x;
        //     n = -n;
        // }
         if(n%2==0)
        {
           return hp;   //for odd condition we can write this ' hp= x*hp '
        // hp=x*hp;   
        }
         
        else{
            return x*hp; 
             }     //then here will come 'hp'
        // return hp;
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num for power ");
        int x = sc.nextInt();
        System.out.println("ENter power ");
        int n = sc.nextInt();
        // System.out.println(power(x, n));
        System.out.println(Optimized(x, n));
        
    }
}
