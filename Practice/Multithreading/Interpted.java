class Ets implements Runnable{

    public void run()
    {   
        for(int i=0;i<3;i++)
        try
        {
            System.out.println("Running");
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println("Interpted thread");
        }
    }
}

public class Interpted {
    public static void main(String[] args) {

        Ets n = new Ets();
        Thread er = new Thread(n);

        er.start();
        er.interrupt();
        
    }
}
