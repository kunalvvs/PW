package APIs;

import java.util.ArrayList;
import java.util.*;

public class foreach {
    public static void main(String[] args) {
        ArrayList as = new ArrayList();

        as.add(22);
        as.add(55);
        as.add(85);
        as.add(484);

         List l = Arrays.asList(2,32,34,2);
         System.out.println(l);

        as.forEach(i->System.out.print(i+" "));
    }
}
