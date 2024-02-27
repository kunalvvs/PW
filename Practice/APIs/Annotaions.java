package Practice.APIs;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.CONSTRUCTOR)
@interface custom{}

class de{
@custom
    de()
    {
        try{
            for(int i=0;i<20;i++)
            {
                System.out.print(".");
                Thread.sleep(500);
            }
        System.out.println("Succeed");
        
        }
        catch(Exception e )
        {
            System.out.println(e);
        }
    }
}


public class Annotaions {
    public static void main(String[] args) {
      de h = new de();  
    }
}
