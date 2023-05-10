package RevisionEvaluvation;
import java.util.Scanner;
public class BookTable  {
    Scanner sc = new Scanner(System.in);
    String str = "";
    static int tableFor2 = 8, tableFor4 = 4, tableFor6 = 2, tableFor8 = 2;
    boolean falgg = true;

    public void booking(String name, int a) {
        if (a <= 2) {
            if (tableFor2 != 0) {
                System.out.println("yout table for " + a + " is booked");
                tableFor2--;
            } else if (tableFor4 != 0) {
                System.out.println("yout table for " + a + " is booked");
                tableFor4--;
            } else if (tableFor6 != 0) {
                System.out.println("yout table for " + a + " is booked");
                tableFor6--;
            } else if (tableFor8 != 0) {
                System.out.println("yout table for " + a + " is booked");
                tableFor8--;
            } else {
                try {
                    falgg = false;
                    throw new NoResevationFoundException();
                } catch (NoResevationFoundException e) {

                }
            }
        } else if (a <= 4) {
            if (tableFor4 != 0) {
                System.out.println("yout table for " + a + " is booked");
                tableFor4--;
            } else if (tableFor6 != 0) {
                System.out.println("yout table for " + a + " is booked");
                tableFor6--;
            } else if (tableFor8 != 0l) {
                System.out.println("yout table for " + a + " is booked");
                tableFor8--;
            } else {
                try {
                    falgg = false;
                    throw new NoResevationFoundException();
                } catch (NoResevationFoundException e) {

                }
            }
        } else if (a <= 6) {
            if (tableFor6 != 0) {
                System.out.println("yout table for " + a + " is booked");
                tableFor6--;
            } else if (tableFor8 != 0) {
                System.out.println("yout table for " + a + " is booked");
                tableFor8--;
            } else {
                try {
                    falgg = false;
                    throw new NoResevationFoundException();
                } catch (NoResevationFoundException e) {

                }
            }
        } else if (a <= 8) {
            if (tableFor8 != 0) {
                System.out.println("yout table for " + a + " is booked");
                tableFor8--;
            } else {
                try {
                    falgg = false;
                    throw new NoResevationFoundException();
                } catch (NoResevationFoundException e) {

                }
            }
        }
    }
    public void exit(){
        System.out.println("Thank you for order ");
    }


}
