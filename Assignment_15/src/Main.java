import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalThreadStateException {

            ThreadDemo threadDemo = new ThreadDemo();
//            threadDemo.start();
//            threadDemo.interrupt();
//            threadDemo.start();


        ThreadRun threadRun = new ThreadRun();
        Thread t1 = new Thread(threadRun);
        ThreadRun threadRun1 = new ThreadRun();
        Thread t2 = new Thread(threadRun1);
        ThreadRun threadRun2 = new ThreadRun();
        Thread t3 = new Thread(threadRun2);

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());





    }
}