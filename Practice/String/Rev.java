package Practice.String;

public class Rev {
    public static void main(String[] args) {
        String st = "Kunal Vish";
        String st1 = "";

        // st=st.replace(" ","");

        String ar[]=st.split(" ");

        for (int i = st.length()-1; i>=0; i--)     //Simple reverse
        {
            st1= st1+st.charAt(i);
        }
        System.out.println("Simple Reversing: " + st1);

        for ( String n : ar)
        {
            for (int i = n.length()-1 ; i>=0;i--)
            {
                st1= st1+n.charAt(i);
            }
            st1=st1+" ";
        }
        System.out.println("Word Reveresing "+st1);
    }
}
