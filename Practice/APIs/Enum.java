package Practice.APIs;
import Practice.APIs.Hjak;

enum Hjak
{
    S,NJ;
    Hjak()
    {
        System.out.println("Constructor inside enum");
        met();
    }
    int a=20;
    void met()
    {
        System.out.println("Methood inside enum "+a);
    }
}

public class Enum {
    public static void main(String[] args) {
        
        Hjak k = Hjak.S;
        System.out.println(k);
    }
}



