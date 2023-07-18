package Practice.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        
        hs.add(23);
        hs.add(34);
        hs.add(76);
        hs.add(78);

        System.out.println(hs);

        LinkedHashSet lh = new LinkedHashSet<>();

        lh.add(23);
        lh.add(34);
        lh.add(76);
        lh.add(78);

        System.out.println(lh);
    }
}
