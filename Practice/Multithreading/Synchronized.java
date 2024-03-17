
class rr implements Runnable{

    /*synchronized*/ public void run()
    {
       /*we can use synchronized block here  */try{
        synchronized(this){ 
            System.out.println(Thread.currentThread().getName()+" start ");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" run ");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" stop ");
        }
    }
        catch(Exception e)
        {
            System.out.println("Wait...");
        }
    }
}
public class Synchronized {
    public static void main(String[] args) {
        rr n = new rr();
        Thread t1 = new Thread(n);
        Thread t2 = new Thread(n);
        Thread t3 = new Thread(n);

        t1.setName("First step");
        t2.setName("Second step");
        t3.setName("Final step");

        t1.start();
        t2.start();
        t3.start();
        t2.interrupt();

    }
}
