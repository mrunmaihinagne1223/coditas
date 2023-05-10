/*//2/22/2023
Check packages?
Commond use to make packages?
Herichy of error ?
What defult exection?
   Comipler gives
Exception - An event which disturb or distrup flow of excution
Object is super class of all class & in java we have 40 exception in java.lan
Object==>
        throwable
                 ===>Error -   -->not for developer
                 ===>Exception --parent exception class
                        -its own exceptiom
                        -runtime exception
Type of exception in java
    Compilation exception     ==> compile time exception(Syntax)8
    Interpretation exception  ==> runtime time exception

Five =Try     -{} has to come catch or finally main is catch Caught exception error
     =catch   -{}
     =finally -{}
     =throw   -keyword -->help to throw exception explicity throw new ArithmaticException
                       --new Class();anoymous object

     =throws  -keyword
*/


class SimpleDemo{
    public  void show() {
        int a = 12;
        int b= 0;
        int result=0;

        //System.out.println("Hey this ");  // Till this exceuted without error
        try {
            try {
                result = a / b;
            }
            catch ( ArithmeticException e){
                System.out.println("Arithmation exception occur 1 ");  //compulsory

            }


             String s = null;
            System.out.println(s.length());


        }//either or nor finally
        catch ( ArithmeticException e){
           // System.out.println("Arithmation exception occur");  //compulsory
            e.printStackTrace();
        }
        catch (NullPointerException n){
            System.out.println("NullPointer exception occur");
            //n.printStackTrace();
           // System.out.println(n);

            //n.getMessage();
        }
        finally {
            System.out.println("this finally");              //
        }

        System.out.println(result);
    }
}

public class ExpectionHandling {
    public static void main(String[] args) {
        SimpleDemo simpleDemo = new SimpleDemo();
        simpleDemo.show();

    }
}
