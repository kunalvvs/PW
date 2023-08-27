package Practice.DSA.Recursion;

public class BinaryStringProblem {
    public static void BSP(int lastPlace,String str,int n)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
      BSP(0, str+"0", n-1);
      if(lastPlace==0)
      {
        BSP(1, str+"1", n-1);
      }
    }

    public static void main(String[] args) {
        BSP(0,"",5);
    }
}
