import java.util.Scanner;

public class Regularization extends CheckAvailbilty implements Runnable {



    @Override
    public void run() {

        System.out.println("Which Regularization you want");
        System.out.println("Enter 1 : eventRegularization to increase 2 %");
        System.out.println("Enter 2 : emergencyRegularization to increase 10%");
        System.out.println("Enter 3 : HomeVisit to increase 2 % ");


        System.out.println("Enter which regularization ");
        Scanner sc = new Scanner(System.in);
        int choosen = sc.nextInt();

        switch (choosen){
            case 1:
                eventRegularization();
                break;

            case 2:
                emergencyRegularization();
                break;
            case 3:
                homeVisit();
                break;
            case 0:


        }




    }
    public void eventRegularization(){
        currentAttendence=currentAttendence+5;
        System.out.println("Your after  eventRegularization "+currentAttendence);
    }
    public void emergencyRegularization(){
       currentAttendence=currentAttendence+10;
        System.out.println("Your after  emergencyRegularization "+currentAttendence);
    }
    public void homeVisit(){
       currentAttendence=currentAttendence+2;
        System.out.println("Your after HomeVisit"+currentAttendence);
    }



}
