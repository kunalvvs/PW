package Hackerrank.Java;

import java.util.Scanner;
import java.util.StringTokenizer;


public class StringToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String s = sc.nextLine();
       StringTokenizer t= new StringTokenizer(s, " ',._!@?");
        int f = t.countTokens();
System.out.println(f);
//   System.out.println(s);
    //  String s1[] = new String[50];
    //  s1=s.split(" ");
    // int d=s1.length;
    // System.out.println(d);
    //  for(String sn:s1)
    //  {
    //     System.out.println(sn);
    //  }

    for(int i=0;i<f;i++)
    {
        System.out.println(t.nextToken());
    }
     

    }
}
