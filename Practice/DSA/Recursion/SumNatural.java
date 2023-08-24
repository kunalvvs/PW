package Practice.DSA.Recursion;

import java.util.Scanner;

public class SumNatural {
    public static int sumOfNum(int n)
    {
        int res =0;
        if(n==1)
        {
            return 1;
        }
        else
        res=sumOfNum(n-1)+n;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        System.out.println(sumOfNum(n));

    }
}
