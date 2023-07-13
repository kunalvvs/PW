package Practice.String;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String ss = "samir nan";
        String s2 = "amirS nna";

        // ss=ss.replace(" ","");
        // s2=s2.replace(" ","");
        

        ss=ss.toLowerCase();
        s2=s2.toLowerCase();

        char s1[]=ss.toCharArray();
        char s12[] = s2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s12);

        if(Arrays.equals(s1,s12))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");}
        

    }
}
