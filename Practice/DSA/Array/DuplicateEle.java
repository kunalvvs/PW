package Practice.DSA.Array;
//Finding duplicate numbers or element in given array
public class DuplicateEle {
    public static void main(String[] args) {
        int arr[] = {3,45,2,1,6,6,3};
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                System.out.println(arr[i]);
            }
        }
    }
}
