package Practice.DSA.Searching_and_Sorting;

public class InsertionSort {
    public static void InsertSort(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int j=i;
            while(j>0 && a[j]<a[j-1])
            {
                int t= a[j];
                a[j]=a[j-1];
                a[j-1]=t;
                j--;
            }
        }
       for(int i=0;i<a.length;i++)
       {
        System.out.print(a[i]+" ");
       }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[] = {23,4,12,76,5,34};
        InsertSort(a);
    }
}
