package Fifth_week.customException;

public class NonIndianException  extends Exception{   //Make it compile Time exception is checked
    NonIndianException(){
        System.out.println("Default Constructor");
    }

    NonIndianException(String s){
        System.out.println("You are not indian citizen"+s);
    }

    NonIndianException(Throwable cause){
        System.out.println("Throwable cause of NonIndianException...");
    }

    NonIndianException(Throwable cause,String s){
        System.out.println("Throwable and with String...");
    }
}
