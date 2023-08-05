package Hackerrank.Java;

import java.util.*;
//Unfinish ⛔
public class DuplicateWords {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s[] = new String[100];

        for(int i=0;i<n;i++)
        {
          s[i] = sc.nextLine();
        }
         System.out.println("👁️");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s[i]!=s[j])
                {
                    System.out.println(s[i]);
                }
            }
          
            
        }


      

       

       
    }
}
