package Resoures_ForExpection_Handel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Try_Exception {
    public static void main(String[] args)  {
        try {
            FileInputStream fileInputStream = new FileInputStream("abc.text");
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
           // System.out.println(e);
                    /*java.io.FileNotFoundException:
                    abc.text (The system cannot find the file specified)*/
           // System.out.println(e.getMessage());
                    /*abc.text (The system cannot find the file specified)
                     */
            //e.printStackTrace();
            /*java.io.FileNotFoundException: abc.text (The system cannot find the file specified)
            at java.base/java.io.FileInputStream.open0(Native Method)
            at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
            at java.base/java.io.FileInputStream.<init>(FileInputStream.java:158)
            at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
            at Resoures_ForExpection_Handel.Try_Exception.main(Try_Exception.java:8)*/



        }

    }
}
