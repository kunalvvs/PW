package Practice.Static;

public class FirstStatic {

    static{
        int ag = 23;
        System.out.println("Static block 1 "+ag);
    }
    static int a;
    static String s;
    static void met()
    {
        int me = 34;
        System.out.println("Static Method "+ a+s+me);
    }
    void setValue()
    {
        a=10;
        s="Hello";
    }
    void print()
    {
        // this.met();
        System.out.println(a+"\n"+s);

    }
    static {
        a=23;
        s="Strings";
        System.out.println("Static block 2 " + a+"  "+s);
    }
}
class dd{
    public static void main(String args[])
    {
        
        FirstStatic f=new FirstStatic();
        // f.met();
        f.setValue();
        f.met();
        f.print();
    }
}
