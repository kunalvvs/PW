package Practice.Polymorphism;

 class first {
    private String name = "String name";
    int no= 12;
    void met()
    {
        System.out.println("First Method "+name);
    }
}
class Poly2 extends first{
    void met()
    {
        System.out.println("Second Method ");
        System.out.println(no);
    }
}
 class Poly3 extends first{
    void met()
    {
        System.out.println("Third Method ");
        System.out.println(no);
    }
}
 class Poly4 extends first{
    void met()
    {
        System.out.println("Fourth Method ");
        System.out.println(no);
    }
}
class Ma
{
   void pol(first ref)
   {
       ref.met();
   }
}

public class Poly{
    public static void main(String[] args) {
        Poly2 obj = new Poly2();
        Poly3 obj2 = new Poly3();
        Poly4 obj3 = new Poly4();
        Ma obj4 = new Ma();
        obj4.pol(obj2);
        
       
    }
}
