package Practice.Interface;
 import java.util.*;
@FunctionalInterface
interface fg{
    void me(int a,int b);
}

public class Lamda {
    public static void main(String[] args) {
       fg n = (a,b) -> System.out.println("Addition by lamda exp.. " + (a+b));  // fg n = () -> System.out.println("Lamba Exp.");
          
        n.me(23, 230);// n.me();
    }
}
