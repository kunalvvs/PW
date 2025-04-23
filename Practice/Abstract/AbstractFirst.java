package Practice.Abstract;

abstract class A{
     abstract void sd();  
    { //abstract block will call without creating object
        System.out.println("abstract method ");
    }
   int k;
   A()
   {
       System.out.println("Constructor in abstract class");
   }
}
class B extends A{
    void sd()
    {
        System.out.println("Normal method");
    }
}
public class AbstractFirst {
    public static void main(String[] args) {
        A o = new B();
        // o.sd();
    }
}
