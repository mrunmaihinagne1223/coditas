package Resoures_ForExpection_Handel;

public class FinallyBlock {
    public static void main(String[] args) {
        System.out.println("I am after Start");
        try {
           int a=2;
           int b=0;
           int result=0;
           result=a/b;
        }
       // System.out.println("I am after Middle");
            /* It will not exceute*/
//        catch (Exception e){
//            System.out.println(e);
//        }
        finally {
            System.out.println("Final end program");
        }
        System.out.println("End");
    }
}
