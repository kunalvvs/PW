package Practice.DSA.Recursion;

import java.util.Scanner;

public class arraySortedCheck {
    
    public static boolean sortCheck(int arr[], int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sortCheck(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,999,2,4};
        
        System.out.println(sortCheck(arr, 0));
    }
}
