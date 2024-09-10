package Practice.DSA.Searching_and_Sorting;

import java.util.Scanner;

public class LowerBound {
        
    public static int lb(int[] arr, int x)
    {
        int low = 0;
        int high = arr.length-1;
        int result = -1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==x)
            {
                result=mid;
                high=mid-1;
            }
            else if(arr[mid]>x)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
    }
    return result;
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched : ");
        int x = sc.nextInt();
        
        int res = lb(arr,x);

        if(res==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at index "+res);
        }
    }
}
