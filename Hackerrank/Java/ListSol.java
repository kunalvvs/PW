package Hackerrank.Java;
import java.util.Scanner;
import java.util.ArrayList;

public class ListSol {
    public static void main(String[] args)  {
        ArrayList l = new ArrayList();
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int s = sc.nextInt();
            l.add(s);
        }     
         
        System.out.println("Insert");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
    l.add(n1,n2);
     System.out.println("Delete");
     int d = sc.nextInt();
      l.remove(d);
      for(Object o :l){
      System.out.print(o+" ");
      }
    }
}
