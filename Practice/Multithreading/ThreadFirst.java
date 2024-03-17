// package Practice.Multithreading;

class ex  {
   public void run(){
        System.out.println("class will be inheritate ");
    }

}
class ThreadFirst1 extends ex implements Runnable //we can use extends Thread here
{
    public void run()
    {
        System.out.println(" Thread  fc");
    }
} 
class sec implements Runnable{   //extends Thread

    public void run()
{   
    try
    {
        System.out.println("it second thread ");
        Thread.sleep(2000);
    }
    catch(Exception e)
    {
        System.out.println("Handle it"+e);
    }
    System.out.println("Print something after ");
}
}
public class ThreadFirst {
    public static void main(String[] args) {
        ThreadFirst1 f = new ThreadFirst1();
        sec s = new sec();
        ex ed = new ex();

        Thread t1 = new Thread(f);
        Thread t2 = new Thread(s);
        
        t1.start();   //execute by thread scheduler 
        t2.start();    //execute by thread scheduler due to start()
        ed.run();      //execute without thread scheduler 
        System.out.println("Main finished");
    }
}
