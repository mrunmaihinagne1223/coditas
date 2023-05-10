public class ThreadDemo extends Thread {
    @Override
    public void run() {
        for (int i =0;i<100;i++){
        System.out.println("THread one is runiing");}
    }



}
class ThreadDemo2 extends Thread {
    @Override
    public void run() {
        for (int i=0;i<100;i++){
        System.out.println("Thred two runing");}

    }
}