package Practice.Constructor;

public class Constructor {
    void val(int a,int b)
    {
       
        if(a>b)

        {
            
            System.out.println("Condtion Executed");
        }      
   
    }
    
    Constructor()
    {
        this(0);
        int a1=78;

        System.out.println("Default Constructor");
        System.out.println(a1);

        
       

    }
    
    Constructor(int a)
    {
        // this();
        System.out.println("Parameterized Constructor");
        System.out.println(a);
    }
    public void metthhh()
        {
            
            System.out.println("Method");
        }
}
class Demo
{
    public static void main(String[] args) {
        Constructor c=new Constructor();
        c.metthhh();
        Constructor c1=new Constructor(10);
        c.val(3,4);
    }
}
