package Practice.DSA.Recursion;

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
        int arr[] = {1,24,4};
        System.out.println(sortCheck(arr, 0));
    }
}
