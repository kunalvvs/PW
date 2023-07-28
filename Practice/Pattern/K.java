package Practice.Pattern;

public class K {
    public static void main(String[] args) {
        int n=20;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 && j==j-1 || i==i+1 || j<(n-1)/2 || i<(n-1)/2)
                System.out.println("*");
               
            }
        }
    }
}
