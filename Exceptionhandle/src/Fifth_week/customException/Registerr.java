package Fifth_week.customException;

public class Registerr {
    public void CheckCriteria(String citizenship, int age) {
        if (age < 18)
            try {
                throw new AgeNotVaild(" you are not eligible");
            }
            catch (AgeNotVaild a){
                System.out.println();

            }


        if (!citizenship.equalsIgnoreCase("Indian")) {
            try {
                throw new NonIndianException(" you are not eligible");
            } catch (NonIndianException e) {
                //throw new RuntimeException(e);
                System.out.println(e.getMessage());
                System.out.println();
            }
        }

    }
}
