package Practice.Collection.practice;

import java.io.*;
import java.util.*;
import java.util.Iterator;

public class Iterators {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    ArrayList mylist = new ArrayList();
     // ArrayList<Integer> mylist1 = new ArrayList<Integer>();
       
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
    //    int st[] = new int[50];
    //    String st1[] = new String[50];
       
       for(int i=0;i<n;i++)
       {
           int st = sc.nextInt();
           mylist.add(st);
       }
       for(int i =0;i<m;i++)
       {
            String st1 = sc.next();
           mylist.add(st1);
       }
    //   System.out.println(mylist);
        Iterator it = mylist.iterator();
        while(it.hasNext()){
           
            Object element = it.next();
          
            System.out.println(element);
            // System.out.println(it.next());
        }
    }
}

