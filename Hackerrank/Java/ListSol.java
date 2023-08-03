package Hackerrank.Java;
import java.util.Scanner;
import java.util.*;

public class ListSol {
    public static void main(String[] args)  {
        List<Integer> l = new ArrayList<Integer>();
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int s = sc.nextInt();
            l.add(s);
        }     
         int kj = sc.nextInt();
        for(int i=0;i<kj;i++)
        {
String insert = sc.next();
       if(insert.equals("Insert"))
       {
         
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
    l.add(n1,n2);
       }else if(insert.equals("Delete"))
       {
    
     int d = sc.nextInt();
     l.remove(d);
       }
       }
    //  sc.close();
      
      for(Object o :l){
      System.out.print(o+" ");
      }
    }
}
