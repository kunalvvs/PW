package Practice.Collection;

import java.util.ArrayList;
import java.util.*;
import java.lang.*;

public class arrList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List a = new ArrayList();

        a.add(9);
        a.add(9);
        a.add("Kunal");
        a.add(23.22);
        System.out.println(a);
         
        System.out.println(a.get(2));
        

        ArrayList b = new ArrayList();
        
        for(int i =0;i<10;i++){
            // a.add(23);
            
            System.out.println(a);
        }
        
        b.add(12);
        b.add(23);
        b.add("Next Number");
        b.add(2,"Add");
        b.add(4, 45);
        System.out.println("\n");
        System.out.println(b);
       
        System.out.println(b.size());
        b.get(3);
        System.out.println(b.get(3));
    }
}
