package Practice.DSA.Recursion;

import java.util.Scanner;
//Alpha assignment questions
//finding all the occurence which equal with key value 
public class Assignments {
    public static void occurence(int arr[],int target,int i)
    {
        if(arr.length==i)
        {
            return;
        }
        if(arr[i]==target)
        {
           System.out.println(i);  //print index
        }
        occurence( arr,target,i+1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[] = { 2,4,2,44,3,2};
        int target = 2;
        
        
        occurence(arr, target, 0);
        System.out.println();
    }
}
