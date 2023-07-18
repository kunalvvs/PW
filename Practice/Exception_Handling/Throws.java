
class M{
  
    void fr() throws Exception
    {
        int a = 22;
        int b = 0;
        System.out.println("thorwo"+a/b);
    }
    void fr1() throws Exception
    {
        fr();
    }

}


public class Throws {
    public static void main(String[] args) {

        M o = new M();
        try{
        o.fr1();
        }
        catch(Exception e)

        {
            System.out.println("handle exception to " + e);
        }
    }
}
