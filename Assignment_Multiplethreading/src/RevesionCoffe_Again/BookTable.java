package RevesionCoffe_Again;
import RevisionEvaluvation.NoResevationFoundException;


import java.util.Scanner;

public class BookTable implements Runnable {

    static int tableFor2 = 8, tableFor4 = 4, tableFor6 = 2, tableFor8 = 2;
    static boolean falgg = true;


    @Override
    synchronized public void run() {
        Scanner sc = new Scanner(System.in);


        String str = sc.nextLine();


        int a = sc.nextInt();



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
                    throw new NoResFoundOrderException();
                } catch (NoResFoundOrderException e) {
                    throw new RuntimeException(e);
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
                    throw new NoResFoundOrderException();
                } catch (NoResFoundOrderException e) {
                    throw new RuntimeException(e);
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
                    throw new NoResFoundOrderException();
                } catch (NoResFoundOrderException e) {
                    throw new RuntimeException(e);
                }
            }
        } else if (a <= 8) {
            if (tableFor8 != 0) {
                System.out.println("yout table for " + a + " is booked");
                tableFor8--;
            } else {
                try {
                    falgg = false;
                    throw new NoResFoundOrderException();
                } catch (NoResFoundOrderException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
