package Practice.DSA.Searching_and_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BuubleSort {

    public static void sortMet(int arr[])
    {
        for(int i=0;i<arr.length;i++)

        {
            boolean swaps = false;
            System.out.println("i loop"+arr[i]);
            for(int j=0;j<arr.length-i-1;j++)
            {
                
                System.out.println("Executing.."+arr[j]);
                if(arr[j]>arr[j+1])
                {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=temp;
                swaps=true;
                }
            }
            if(!swaps)
            {
                break;
            }
        }
        

        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
    
    }
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        int arr[] = { 34,3,2,56,4};
        sortMet(arr);
        System.out.println(Arrays.toString(arr));

    }
}
