import java.util.Scanner;

public class CheckAvailbilty implements Runnable{

    static  int currentAttendence;

    final int totalAttendence=75;

     static boolean falge1 = false;
     synchronized public void run(){
        System.out.println("Enter your Current Attendence");
        Scanner sc = new Scanner(System.in);
        currentAttendence = sc.nextInt();

        if(currentAttendence > 75){
            falge1=true;
            System.out.println("Your Exam is Booked");
        }
        else try {
                throw new InvaildExamBookingAttendence();
            } catch (InvaildExamBookingAttendence e) {
                System.out.println("Vaild Option Regularization");
            }

    }


}
