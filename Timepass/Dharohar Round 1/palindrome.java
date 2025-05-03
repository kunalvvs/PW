import java.util.*;
class palindrome{
    public static void main(String[] args) {
        String st = "Madam";
        String st2 = "";

        st=st.toUpperCase();

        for (int i = st.length()-1; i>=0;i--)
        {
            st2 = st2 + st.charAt(i);
        }
        if(st.equals(st2))
        {
            System.out.println("Given String is Palindrome");
        }
        else
        {
            System.out.println("Given String is not Palindrome");
        }
    }
}