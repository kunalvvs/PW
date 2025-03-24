package Collection;

import java.util.*;

public class Iterators {
    public static void main(String[] args) {
        
        ArrayList n = new ArrayList();
        
        n.add(3);
        n.add(87);
        n.add(33);
        n.add(2);

        for(int i= 0 ; i<n.size();i++)
        {
            System.out.println(n.get(i));
        }
        System.out.println("------------Enhanced Loop-------------");
        for(Object o : n)
        {
            System.out.println(o);
        }
        System.out.println("-------------Iterator------------");
        Iterator it = n.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("----------List Iterator---------------");
        ListIterator lit = n.listIterator(n.size());  
        //it can be work only List collections

        while(lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }

        System.out.println("--------------Hasnext iterator------------");
        ListIterator lit1 = n.listIterator();

        while (lit1.hasNext()) {
            System.out.println(lit1.next());
            
        }
    }
}
