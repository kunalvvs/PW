package Hackerrank.Java;

import java.util.*;
import java.util.Map.Entry;


public class Maping {
    public static void main(String[] args) {
        Map<String,String> m =new LinkedHashMap();
        
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String s = sc.nextLine();
            String s1 = sc.nextLine();
            m.put(s,s1);
        }
        // System.out.println(m);
        while (sc.hasNext()) {
            String queryName = sc.nextLine();
            String phoneNumber = m.get(queryName);
            if (phoneNumber != null) {
                System.out.println(queryName + "=" + phoneNumber);
            } 
            else {
                System.out.println("Not found");
            }
        }
    }
}