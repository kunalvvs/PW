package Practice.APIs;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {

        // ArrayList al = new ArrayList();

        java.util.Date ft = new java.util.Date();
        System.out.println("By Util Package : "+ft);

        java.sql.Date t1 = new java.sql.Date(ft.getTime());
        System.out.println("By SQL Package : "+t1);

        LocalDate d = LocalDate.now();
        System.out.println(d);
    

        LocalTime t = LocalTime.now();
        // t.getHour();
        // t.getMinute();
 
        System.out.println(t);
        
    }
}
