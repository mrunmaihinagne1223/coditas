package Resoures_ForExpection_Handel;

public class Termination_Exception  {
    public static void main(String[] args) {
       Termination_Exception terminationException = new Termination_Exception();
       try {
           terminationException.display();
       }
       catch (Exception e){
           System.out.println(e);
           System.out.println("Im e");
       }
    }
    void display(){


           try {
               int a=12;
               int b=0;
               int result =a/b;
               System.out.println(result);
           }
           catch (Exception e1){
               System.out.println(e1);
               System.out.println("I am e1");
           }





        }
}
