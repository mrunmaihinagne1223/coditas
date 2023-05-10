package MultithreadingResoures;

public class Multithreadingmain {
    public static void main(String[] args) {
      /*  MultithreadingDemo obj=new MultithreadingDemo();
        obj.start();
*/
        Count cnt = new Count();
        System.out.println(cnt);
        try
        {
            while(cnt.isAlive())
            {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread's run is over" );
    }
    }


