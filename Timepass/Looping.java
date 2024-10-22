package Timepass;

public class Looping {
    public static void main(String[] args) {
        int s =0 ;
        System.out.println("Even Number are : ");
        for( int i=12; i<=59;i++){

            if( i%2==0){
                System.out.println(i);
                s =s+i;
            }
          
        }

        System.out.println("Sum of total even number is "+s);
        System.out.println("Average of ");

    }
}
