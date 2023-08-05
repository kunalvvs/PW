package Practice.DSA.Array;

public class Rotation {
    public static void main(String[] args) {
        int arr[][] = {{2,43,2},{4,34,2},{4,2,5}};
        int a[][] = new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                a[i][j]=arr[j][i];
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
        
    }
}
