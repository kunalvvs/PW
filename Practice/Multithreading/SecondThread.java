
class extra {
    void run()
    {
        System.out.println("First class executing");
    }
}
class SD extends extra implements Runnable{

   public void run()
    {
        try{
        for(int i = 0; i<=3;i++)
        {
            System.out.println("Thread running");
            Thread.sleep(2000);
        }
    }
    catch(Exception e)
{
    System.out.println("something went wrong interpted ");
}
}
}
public class SecondThread  {
    public static void main(String[] args) {
        SD ne = new SD();
        System.out.println("Main Method started");
        extra  er = new extra();
        Thread sk = new Thread(ne);
         er.run();
         System.out.println("Thread condition "+sk.isAlive());
        try{
        sk.start();
         System.out.println("Thread condition "+sk.isAlive());
        sk.join();
       
        }
        catch(Exception e){}
        
       
        System.out.println("Ended main method ");
        
    }
}
