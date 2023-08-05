package Practice.DSA.Array;

public class Reversal {
    public static void main(String[] args) {
        int s[] = {2,3,223,344,2};
        int n = s.length;

        for(int i=0;i<n/2;i++)
        {
            int temp = s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=temp;
        }
       System.out.print("Reversable array is : ");
        for(int a:s)
        {
            System.out.print(a+",");
        }
        System.out.println();
    
    }
}
