package Hackerrank.Java;
import java.util.*;
public class ArrayListt {
    public static void main(String[] args) {
        ArrayList al =new ArrayList();
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int n1=sc.nextInt();
            for( i=0;i<n1;i++)
            {
                int arr = sc.nextInt();
                al.add(arr);
            }
            int n2 = sc.nextInt();
            for( i=0;i<n2;i++)
            {
                int arr1 = sc.nextInt();
               Object a1 = al.add(arr1);
            }
        }


    }
}
