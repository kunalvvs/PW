package Practice.Abstract;

abstract class A{
     abstract void sd();
    {
        System.out.println("abstarct methid ");
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
        o.sd();
    }
}
