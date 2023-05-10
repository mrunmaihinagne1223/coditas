import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;

public class Q3 {
    public static void main(String args[]){
        LocalDate currentData = LocalDate.now();
        DayOfWeek dow = currentData.getDayOfWeek();
            String day = String.valueOf(dow).toLowerCase();

            String arr[] = {"monday", "tuesday","wednesday", "thursday", "friday", "saturday", "sunday"};

            for (int i =0; i< arr.length; i++){
                if(arr[i].equals(day)){
                    continue;
                }
                System.out.println(arr[i]);
            }
    }
}

