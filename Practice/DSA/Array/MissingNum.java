package Practice.DSA.Array;

public class MissingNum {
    public static void main(String[] args) {
        int arr[] = {2,4,1,6,7,3};
        System.out.println("✅ ✅ ✅ ✅ ✅ ✅ ✅ ✅");
        int m = arr.length;
        int n = m+1;
        System.out.println("Length : "+m);
        int sumOfNaturalNum = ((n+1)*n)/2;
        System.out.println("Summ of natural number : "+sumOfNaturalNum);
        int sum=0;
        for(int i=0;i<m;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum : "+sum);
        int MissNum = sumOfNaturalNum - sum;
        System.out.println("Missing Number is "+MissNum);
    }
}
