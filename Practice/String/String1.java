package Practice.String;
class String1 {
    public static void main(String[] args) {
        String dn = new String("it is inmutable String");
    dn=dn.concat(" new line");

    String s2 = "Innovative";
    // s2.concat("Developer");      this synatx will not work due to immutable string
    s2=s2.concat(" Developer");   //it refer the immutable string from the reference variable 
    System.out.println(s2);
        System.out.println(dn);


        // concatenation 
        System.out.println("Hee"+99+55);
        System.out.println(56+45+"Hee");


        // String methods 
        System.out.println(s2.substring(3,6));
        System.out.println(s2.charAt(4));

    }
}
