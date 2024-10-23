package Timepass;

import java.util.*;

public class Loop2 {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        int n =  sc.nextInt();
         int[] n1 =  {2,4,2,4};

        
        String s1[] = new String[n];

        for( int i =1 ; i<s1.length;i++)
        {
           s1[i] = sc.nextLine();
           
        }
           
        for(int i=0;i<n1.length;i++)
        {
            System.out.println("N1 "+n1[i]);
        }

        for( int i = 1; i<s1.length; i++)
        {
            System.out.println("Output "+s1[i]);
        }
    }
}
