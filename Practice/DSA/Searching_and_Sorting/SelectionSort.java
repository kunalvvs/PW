package Practice.DSA.Searching_and_Sorting;

import java.util.*;

public class SelectionSort {
    public static void sort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int min_inx = i;
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[min_inx]>arr[j])
                       min_inx=j;
                }
            }
            if(min_inx!=i)
            {
                int t = arr[min_inx];
                arr[min_inx]= arr[i];
                arr[i] = t;
            }
        }
       
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
    }
    public static void main(String[] args) {
        System.out.println("Unsorted array ");
        int arr[] = {23,4,2,34,5,53,35};
        sort(arr);
    }
}
