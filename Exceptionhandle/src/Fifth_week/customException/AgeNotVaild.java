package Fifth_week.customException;

public class AgeNotVaild extends RuntimeException{    //Make it runtime Time exception is unchecked
    AgeNotVaild(){
        System.out.println("Default Constructor");
    }

    AgeNotVaild(String s){
        System.out.println("You are Minor"+s);
    }

    AgeNotVaild(Throwable cause){
        System.out.println("Throwable cause of NonIndianException...");
    }

    AgeNotVaild(Throwable cause,String s){
        System.out.println("Throwable and with String...");
    }
}
