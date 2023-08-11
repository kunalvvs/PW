package Practice.DSA.Searching_and_Sorting;

import java.util.*;
import java.io.*;

public class BinarySearchAlgo {

    public static int binaryS(int arr[],int target)
    {
        int low=0;
        int high =arr.length-1;

        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<high)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
            
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Entre elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            
        }
       for(int i=0;i<n;i++)
            {
            for(int j=i+1;j<n;j++)
        {
        if(arr[i]>arr[j]){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
        }
    }
    // int a1[] = new int[n];
    for( i=0;i<n;i++)
    {
      System.out.println(arr[i]);

    }


}

        System.out.println("Find the element ");
        
            int ta = sc.nextInt();
        
        
        
        int res = binaryS(arr, ta);

        if(res==0)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("Element founded "+ res);
        }

    }
}
