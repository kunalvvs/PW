package Practice.TCS.March25_Codes;

import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n1 = sc.nextInt();

        int s=0;
        for(int i=n;i<=n1;i++)
        {

            s=s+i;
        }

        System.out.println(s);
    }
}
