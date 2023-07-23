package Practice.Map;
import java.util.*;
import java.util.Map.*;
// import java.text.CollationElementIterator;
// import java.util.Collection;
// import java.util.HashMap;
// import java.util.Hashtable;
// import java.util.Iterator;
// import java.util.LinkedHashMap;
// import java.util.TreeMap;

public class Hash_Map {
    public static void main(String[] args) {

        //Here we can change other map Tree,LinkedList 
        Map k = new LinkedHashMap<>();
        
        k.put(2, "hashmap");
        k.put(22,23);
        k.put(3, "Hashmap");

        Collection ku = k.keySet();

        Iterator it=ku.iterator();
        while(it.hasNext()) 
        {
            System.out.println(it.next());
        }      

        Collection v = k.values();

        Iterator it1=v.iterator();
        while(it1.hasNext()) 
        {
            System.out.println(it1.next());
        }      

        Collection en = k.entrySet();

        Iterator it2=en.iterator();
        while(it2.hasNext()) 
        {
            Map.Entry o = (Entry)it2.next();
            System.out.println(o.getKey() + " : "+o.getValue());

        }      


     
    }
}
