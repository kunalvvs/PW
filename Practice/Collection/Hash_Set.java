package Practice.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.*;
// import javax.swing.text.html.HTMLDocument.Iterator;

public class Hash_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set hs = new LinkedHashSet();
        LinkedHashSet p = new LinkedHashSet();
        
        System.out.println("--------------------  Looping   ----------------");
        System.out.println("Type any five string ");
        for(int i =0;i<5;i++)            //By looping 
        {
          String  p1 = sc.nextLine();
            p.add(p1);
            System.out.println(p);
        } 
        
        System.out.println("Collection "+p);
        hs.add(23);
        hs.add(34);
        hs.add(76);
        hs.add(78);
        System.out.println("-------------------   Iterator   ----------------");
        Iterator it = hs.iterator();   //By Iterator 
        while(it.hasNext())
        {
            System.out.println(it.next());  
        }

        System.out.println("Second iteration");
        Iterator it1 = p.iterator();
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }
        
        System.out.println(hs);
        
        LinkedHashSet lh = new LinkedHashSet<>();
        
        lh.add(23);
        lh.add(34);
        lh.add(76);
        lh.add(78);
        
        System.out.println(lh);
    }
}
