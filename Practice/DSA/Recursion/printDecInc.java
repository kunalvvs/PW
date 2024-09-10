package Practice.DSA.Recursion;

public class printDecInc {
    public static void printdec(int n)
    {
        if(n==1)
        
        {
            System.out.println(n);
            return ;
        }
        else
        {
             
            System.out.println(n);
            printdec(n-1);
            
        }
    }
       
    public static void printInc(int n)
    {
         if(n==1)

        {
            System.out.println(n);
            return ;
        }
        else
        {
               printInc(n-1);
            System.out.println(n);
          
           
        }
    }
    public static void main(String[] args) {
        int n =10;
        printdec(n);
          System.out.println("---------------------------------");
        printInc(n);
    }
}
