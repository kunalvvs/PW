package Practice.Final;
final class F{
    F()
    {
        System.out.println("Constructor");
        this.met();
    }
    final void met()
    {
        System.out.println("Final class ");
    }
}
class sec {
    sec(final int aa,int kk)
    {
        kk=96;
        // aa=89;       it is not changable due to final keyword
        System.out.println(aa+kk);
        this.met();
    }
    void met()
    {
        
        System.out.println("Final method ");
    }
}
public class FinalPro {
    public static void main(String[] args) {
        sec o = new sec(45,233);
    }
}
