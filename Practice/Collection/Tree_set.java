package Practice.Collection;

import java.util.TreeSet;

public class Tree_set {
    public static void main(String[] args) {
        
        TreeSet t  = new TreeSet();

        t.add("Hello");
        // t.add(23);
       
        TreeSet t1 = new TreeSet();
        t1.add(33);
        t1.add(35);
        t1.add(78);
        // t1.add(35); duplicate value not allowed 
    
        System.out.println(t1);

        System.out.println(t1.lower(35));
        System.out.println(t1.higher(68));

        System.out.println(t1.ceiling(30));
        System.out.println(t1.floor(40));

        System.out.println(t);


    }
}
