import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*Throw specially for compiler
* custom
* */
class SimpleException{
    int a=7; int b=9;
    int result =0;
    public void display2()  {

//        try {
//            FileInputStream fileInputStream = new FileInputStream("abcd.txt");
//        } catch (FileNotFoundException e) {
//           // throw new RuntimeException(e);
//            System.out.println(e);
//        }

    }
}
public class ExceptionThrow {
    public static void main (String[] args) throws FileNotFoundException{
         SimpleException simpleException=new SimpleException();
         simpleException.display2();
    }
}
