package MultithreadingBookingApp;

public class BankThreadSeat {
    int total_seat = 10;
    void bookSeat(int seats){
        if(total_seat >= seats){
            System.out.println(" SeatBook ");
            total_seat = total_seat - seats;
            System.out.println(total_seat);
        }
        else {
            System.out.print(" Reaming seat ");
            System.out.println(total_seat);
        }
    }
}
