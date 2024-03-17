package Practice.Generics;
import java.util.*;
import java.lang.*;

class gen<T>
{
    gen(T ob)
    {
        System.out.println(ob.getClass().getName());
        System.out.println(ob);
        
    }
    public <T> void disp(T ob)
        {
            System.out.println("Method");           
        }
}
public class GEN {
    public static void main(String[] args)  {
        gen<String> k = new gen<String>("55");
        // disp();
    }
}
