package Practice.Collection;

import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        LinkedList l1 = new LinkedList();

        l.add(23);
        l.add("Hello");
        // l.clear();
        // l.removeFirst();
        l.addFirst("Head");
        l.addLast("Tail");

        l1.add("Seodn");
        System.out.println("1. L1 - "+l1);

        System.out.println("2. Without operation "+l);
         System.out.println(l.get(2));
        System.out.println("3. peekLast - "+l.peekLast());
        System.out.println("4. Remove - "+l1.removeFirst());
        System.out.println("5. L1- > "+l1);
        System.out.print("Push = ");
        l.push(3);
        System.out.println(l);
        l.pop();
        System.out.println("After pop "+l);
        
    }
}
