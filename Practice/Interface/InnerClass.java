package Practice.Interface;

class O{
 void outside()
 {
    System.out.println("Outside class ");
    
 }

  static class inside {         
    void i()
        {
        System.out.println("Inside class");
        }
    }

}
public class InnerClass {
    public static void main(String args[])
    {
        O  ob = new O();
        O.inside ob1 = new O.inside();
        ob.outside();
        
        ob1.i();
    }
    
}
