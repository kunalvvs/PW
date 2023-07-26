package Practice.APIs;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        
        // // java.util.Date t = new java.util.Date();
        // System.out.println(t);

        // java.sql.Time t1 = new java.sql.Time(t.getTime());
        // System.out.println(t1);

        LocalDate d = LocalDate.now();
        System.out.println(d);
       
        

        LocalTime t = LocalTime.now();
        t.getHour();
        t.getMinute();

    
        
        System.out.println(t);
        
    }
}
