public class Test implements Runnable{
    String name;
    Thread t;
    Test(String threadname) {
        name = threadname;
        t = new Thread(this, threadname);
        System.out.println("New thread: "+ name +t);
        t.start();
    }


    @Override
    public void run() {

        //return false;
    }


}
