package Practice.Interface;
interface  hkk{
    default void ho()  //here we can use static keyword where is default keyword 
    {
        System.out.println("Overrode");
    }
}
interface ne extends hkk{
    void nne();
}
class se implements hkk,ne{
     public void ho()
    {
        System.out.println("Interface");
    }
    public void nne()
    {
        System.out.println("Second Interface");
    }
}
public class FirstInterface {
    public static void main(String[] args) {
        ne o = new se();
        o.ho();
        o.nne();
        
    }
}
