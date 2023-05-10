import java.time.LocalDate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main  {
    public static void main(String[] args) {
        System.out.println("*************ADDITION********************");
        System.out.println(Addition.add(78,88));
        System.out.println(Addition.add(7.9f,99));
        System.out.println(Addition.add(9,8.9f));

        System.out.println("******************VARAGS***********************");
        System.out.println(AdditionVarags.add(88,99,9,98));

        System.out.println("*********************ENUM****************************");
        TraficLight light = TraficLight.RED;
        switch (light){
            case RED -> System.out.println("STOP");
            case YELLOW -> System.out.println("GET READY");
            case GREEN -> System.out.println("GO");
        }
        System.out.println("**********************************************");
        LocalDate date ;
        date=LocalDate.now();
        date=date.plusMonths(1);
        System.out.println("Date : "+date);


    }
}