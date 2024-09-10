package Practice.Array;

import java.util.Scanner;

public class EnhanceLoop {
    public static void main(String[] args) {
        int a[][] = {
            {2,4,3},{3,53,4,4}
        };

        int a1[] = { 2,4,2,4,3,5,34};
        String sd[] = {"New", "Sec"};
        System.out.println("------------------------------\nFor 2D Array");
        for( int  s[] : a)
        {
            for(int d:s)
            {
            System.out.print(d+" ");
        }
        System.out.println();


    }
    System.out.println("----------------------------------\nFor 1D Array");
    for(Object obj : a1)
    {
        System.out.print(obj+",");
    }
    System.out.println();
    System.out.println("-----------------------------------\nFor String");
    for(String f:sd)
    {
        System.out.println(f);
    }

    }
}
