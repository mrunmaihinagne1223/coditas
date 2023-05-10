import java.time.DayOfWeek;
import java.time.LocalDate;

public class Q2 {
    public static void  main(String args[]){
        LocalDate currentData = LocalDate.now();
        DayOfWeek dow = currentData.getDayOfWeek();
        System.out.println(dow);

        switch(dow){
            case MONDAY :
                System.out.println("the start of week");
                break;
            case TUESDAY :
                System.out.println("the seconday of week");
                break;
            case WEDNESDAY:
                System.out.println("the third of week");
                break;
            case THURSDAY:
                System.out.println("the fourth of week");
                break;
            case FRIDAY:
                System.out.println("the fifth  of week");
                break;
            case SATURDAY:
                System.out.println("the six of week");
                break;
            case SUNDAY:
                System.out.println("the seven of week");
                break;
            default:
                System.out.println("Invalid");


        }



    }

}
