
import java.util.*;
public class LaunchAL 
{
    public static void main(String[] args) 
    {
        
        ArrayList al1=new ArrayList();

        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);

        System.out.println(al1.contains(200));

        int index=al1.indexOf(300);
        System.out.println(index);
        System.out.println(al1.size());

        al1.ensureCapacity(10);
        al1.trimToSize();
        System.out.println(al1.size());

        al1.clear();
        System.out.println(al1);

        List al=new ArrayList();

        al.add(100);
        System.out.println(al);
        

        // System.out.println("****************************************");

        // ArrayList al2=new ArrayList();

        // al2.add("PW Skills");
        // al2.add(1);
        // al2.add('j');
        // al2.add(1.1);
        
        // System.out.println(al2);

        // System.out.println("****************************************");

        // al2.add(100);

        // System.out.println(al2);

        // System.out.println("****************************************");


        // ArrayList al3=new ArrayList();

        // al3.add(1);
        // al3.add(2);
        // al3.add(4);
        // System.out.println(al3);

        // System.out.println("After adding collection");

        // al3.addAll(al2);
        // System.out.println(al3);

        // al3.add(2, "PW");

        // System.out.println(al3);
        // al3.add(100);

        // System.out.println(al3);



        
    }
    
}
