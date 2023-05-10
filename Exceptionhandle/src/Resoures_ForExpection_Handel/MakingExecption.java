package Resoures_ForExpection_Handel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* Nested try if dont have its own catch then it follow for
specilization to genralization
*/

public class MakingExecption {
    public static void main(String[] args)  {

            //FileInputStream fileInputStream = new FileInputStream("abc.text");
            /*        ------CompileTime Exception checked */

       try {
           try {
               int a = 8;
               int b = 8;
               int result = 0;
               result = a / b;
               System.out.println(result);

           } finally {
               System.out.println("its finally");
           }

           String name = null;
           System.out.println(name.length());

       }

       catch (NullPointerException n){
           System.out.println("NullPointerException");
       }
       catch (ArithmeticException aa){
           System.out.println("AritmaticPointerException");
       }
       catch (Exception e){
           System.out.println(e);

       }
        System.out.println("End Program");



    }
}
