package MultithreadingBookingApp;

public class MoveBookApp extends Thread{
       BankThreadSeat b;
       int seats;
       public void run(){
        b.bookSeat(seats);
       }
}
