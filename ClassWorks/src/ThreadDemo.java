class SimpleeDemo extends Thread{
    //after calling start()control comes here
    public  void run(){
       for (int i =0; i<5;i++) {
           try {
               Thread.sleep(500);
               System.out.println("Current THred " + Thread.currentThread());

           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }

       }
    }
    public  void display(){
        System.out.println("Display simple");
    }
}



public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        SimpleeDemo sc = new SimpleeDemo();
        SimpleeDemo sc1 = new SimpleeDemo();
        SimpleeDemo sc2 = new SimpleeDemo();
        //it calls run() do no do sc.run()
       sc.setName("A");
        sc1.setName("B");
        sc2.setName("C");

        System.out.println("Is sc alive before join"+sc.isAlive());
        sc.start();
        sc.join();
        System.out.println("Is sc alive after join"+sc.isAlive());

      //  sc.start();             // IllegalThreadStateException
        sc1.setDaemon(true);
        sc1.start();
        //sc1.run();            // Explicate run method ?



        System.out.println("before start Curent state"+sc2.getState());
        sc2.start();
        System.out.println("after start Curent state"+sc2.getState());




    }
}
