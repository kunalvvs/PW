class Custom extends Exception{
    void id()
    {
        System.out.println("Custom my exception");
    }
    Custom(String s)
    {
        System.out.println("my exception constructor");
    }
}

public class Throw {
    public static void main(String[] args) throws Exception {
      
        int a = 9;
        int b= 4 ;
        try{
        System.out.println(a/b);
        throw new Custom("Error");
        // Custom v = new Custom("Error or mistakes");
        }
        catch 
        (Exception e)
        {
            System.out.println("Exception occur");
        }
        
    }
}
