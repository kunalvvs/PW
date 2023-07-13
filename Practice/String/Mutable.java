public class Mutable {
    public static void main(String[] args) {
        
        final StringBuilder ss = new StringBuilder();
        ss.append("Hello it is a String type of program ");
        System.out.println(ss);
        // ss=new StringBuilder("Update");
        System.out.println(ss.length());
        System.out.println(ss.capacity());
        
    }
}
