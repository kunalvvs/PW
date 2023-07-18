package Practice.Collection;

import java.util.ArrayList;
import java.util.*;
import java.lang.*;

public class arrList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList a = new ArrayList();

        a.add(9);
        a.add("Kunal");
        a.add(23.22);
        System.out.println(a);
        ArrayList b = new ArrayList();
        
        for(int i =0;i<10;i++){
            a.add(23);
            
            System.out.println(a);
        }
        
        b.add(12);
        b.add(23);
        b.add("Next Number");
        b.add(2,"Add");
        
       
        System.out.println(b.size());
        b.get(3);
        System.out.println(b.get(3));
        


    }
}
