package Practice.DSA.Searching_and_Sorting;

import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.io.*;

public class SquareRoot {
    public static int findSq(int n)
    {
        int low = 0;
        int high = n;
        int res = -1;

        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int val = mid*mid;

            if(val==n)
            {
                return mid;
            }
            else if(val<n)
            { 
               
                res = mid;
                low = mid+1;
                
            }
            else
            {
                high=mid-1;
            }
           
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number for finding square root ");
        int n  = sc.nextInt();

        int res = findSq(n);

        System.out.println("Square root is "+res);
    }
   
}

