package Practice.Interface;
interface as{
    void tr(int f);
    
}

public class Annonymous {
 public static void main(String[] args) {
    as o = new as(){
        public void tr(int f)
        {
            System.out.println("Annonymous "+" : " + f);
        }
    };
    o.tr(24);
 }
}
