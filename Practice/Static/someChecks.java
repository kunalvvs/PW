package Static;
 class someChecks {
    static{
        System.out.println("Hello");
    }
    void meett()
    {
        System.out.println("first");
    }
}
    class de extends someChecks {
        void meett()
        {
            System.out.println("second");
        }
    }
class Sec{
    public static void main(String[] args) {
        System.out.println("World");
        someChecks d=new de();
        d.meett();
        // int n=8;
       
        // for(int i=0;i<n;i++) 
        // {
            
           
        //     System.out.println("Hackedddd ii kk\n");
        //     }
        }
    }