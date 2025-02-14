package Practice.String;
public class Mutable {
    public static void main(String[] args) {
        
        final StringBuilder ss = new StringBuilder("hhjhj");
        StringBuffer sb = new StringBuffer("ghbjbjbjb");
        sb=sb.append(" vgrgr");
        
        // StringBuffer ne = ss;  
        // 👆we can't perform this initialization due to final keyword
        
        System.out.println("StringBuffer : "+sb);
       
        
        ss.append("Hello it is a String type of program ");
        System.out.println(ss);
        // ss=new StringBuilder("Update");
        String s1,s2;
        s1="eeer";
        s2="fevev";
        s1=s2;
        System.out.println(s1+s2);
        System.out.println(ss.length());
        System.out.println(ss.capacity());   
    }
}