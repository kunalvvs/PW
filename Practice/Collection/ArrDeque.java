package Practice.Collection;

import java.util.ArrayDeque;

public class ArrDeque {
    public static void main(String[] args) {
        ArrayDeque ar = new ArrayDeque();

        ar.add("Front");
        ar.add(23);
        ar.add(43);
        ar.add(43);
        ar.add("Rear");
        

        System.out.println(ar);

        ar.offer(2);  //offer method can reject by automation than add method

        System.out.println(ar);

        System.out.println("Check empty " + ar.isEmpty());
        ar.push(234);
        System.out.println(ar);
        ar.addFirst("First");
        ar.addLast("Last");
        System.out.println(ar);

    }
}
