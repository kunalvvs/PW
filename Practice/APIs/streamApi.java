package Practice.APIs;

import java.util.*;
import java.util.stream.Stream;

public class streamApi {
    public static void main(String[] args) {
        List a = Arrays.asList(2,45,3,4,22);
        
        Stream<Integer> st = a.stream();
          
        
       
        Stream ne = st.sorted().map(n->n*n).limit(4);
        
        ne.forEach(n->System.out.println(n));
        System.out.println(a);
        
    }
}
