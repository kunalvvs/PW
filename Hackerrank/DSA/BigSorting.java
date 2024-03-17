import java.math.BigInteger;
import java.util.Scanner;

import Practice.APIs.foreach;

import java.util.*;
class BigSorting {
   public static int[] sort(int a[] , int i)
   {
     if(i==a.length)
     {
        return a;
       
     }

     if(a[i]>a[i+1])
     {
       return a;
     
     }
   return sort(a, i+1);
    }
   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();

        }
       
        for(int i=0;i<n;i++)
        System.out.println(sort(a, 0));
        
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);

        }
    }
}