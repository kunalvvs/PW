

import java.util.*;

public class SelectionSort {
    public static void sort(int arr[])
    {
       for(int i=0;i<arr.length;i++)
       {
        int minPos=i;
       
        for(int j=i+1;j<arr.length;j++)
        {
            
            if(arr[minPos]>arr[j])
            {
                minPos=j;
            }
            
        }
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
       }
       
       
        System.out.println("Sorted Array ");
       
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
    }
    public static void main(String[] args) {
        System.out.println("Unsorted array : 23,4,2,34,5,53,35");
      
        int arr[] = {23,4,2,34,5,53,35};
        sort(arr);
    }
}
