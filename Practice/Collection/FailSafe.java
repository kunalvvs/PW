package Practice.Collection;
import java.util.*;
// import java.util.concurrent.*;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
    public static void main(String[] args) {
        
        ArrayList a = new ArrayList();

        a.add(23);
        a.add(45);
        a.add(87);
        a.add(76);

        System.out.println(a);

        // for(int i=0;i<a.size();i++)    // these loop going infinite
        // {
        //     System.out.println(a.get(i));
        //     a.add(100);
        // }
        System.out.println("------------By Loop-------------");
        for (Object o : a) {  //fail fast 

            System.out.println(o);
            // a.add(100);   // it gives concurrent exception
        }
        System.out.println("----------------Iterator-----------------");
        Iterator it = a.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
       System.out.println("CopyWrite Array");
        CopyOnWriteArrayList co = new CopyOnWriteArrayList();

          co.add(23);
          co.add(45);
          co.add(87);
          co.add(76);

        // for (Object o1 : co) {

        //     System.out.println(o1);
        //     a.add(100);   // it gives concurrent exception
        // }

        Iterator it2 = co.iterator(); //fail safe
        while(it2.hasNext())
{
    System.out.println(it2.next());
}
    co.add(100);
        
    }
}
