package Practice.Inheritance;

public class Inheri {
    private String name = "String name";
    int no= 12;
Inheri()
{
    System.out.println("Constructor");
}
   private int met()
    {
        System.out.println("First Method "+name);
        return 0;
    }

}
class Inheri2 extends Inheri{


   public int met()
    {
    
        System.out.println("Second Method ");
        System.out.println(no);
        return 0;
    }
    public static void main(String[] args) {
        Inheri2 obj = new Inheri2();
        // obj.met();
        obj.met();
        // Inheri obj2 = new Inheri();
        // obj2.met();
        // System.out.println(obj2.name);
        // System.out.println(obj.name);
        // System.out.println(obj.no);
    }
}
