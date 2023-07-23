package Practice.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Scanner;
// import javax.swing.text.html.HTMLDocument.Iterator;

public class Hash_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet hs = new HashSet();
        HashSet p = new HashSet();
       
        for(int i =0;i<5;i++)
        {
          String  p1 = sc.nextLine();
            p.add(p1);
            System.out.println(p);

        }
        
        
        // hs.add(23);
        // hs.add(34);
        // hs.add(76);
        // hs.add(78);
        
        // Iterator it = hs.iterator();
        // while(it.hasNext())
        // {
        //     System.out.println(it.next());
            
        // }
        
        // System.out.println(hs);
        
        // LinkedHashSet lh = new LinkedHashSet<>();
        
        // lh.add(23);
        // lh.add(34);
        // lh.add(76);
        // lh.add(78);
        
        // System.out.println(lh);
    }
}
