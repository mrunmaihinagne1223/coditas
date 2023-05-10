//Better way  it allowes behavior of multithreading

class ThreadRunnable extends ThreadDemo implements   Runnable{      // step 1: Implement the runable
//funtional Interfaces
     @Override
     public void  run() {               // step 2: Overide the run
         System.out.println("Im run of runnable");

     }

     public static void main(String[] args) {
         ThreadRunnable t = new ThreadRunnable();               // step 3: Create Oject of test method


         Thread th = new Thread(t);            // Step4: Create Object of Thread and pass test obj
                                               // constructor of it as we dont have runable method in it
         th.start();

     }
 }
