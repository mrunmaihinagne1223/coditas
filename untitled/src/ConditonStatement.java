class SimpleIf{
    public void disply(){
        int number1 = 10;
        if(number1 > 100){
            System.out.println("Num is gre" +number1);
        }
    }
}
class IfElseDemp{
    public void disply(){
        int number1 = 10;
        if(number1> 100){
            System.out.println("Num is gre" +number1);
        }
        else {
            System.out.println("Num is small" + number1);
        }
    }
}

class WhileDemo{

    public void display() {
        int number = 10;
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}
class Dowhile{
    public void display (){
        int number = 10;
        do{
            System.out.println(number+" - Print me");
            number --;
        }
        while (number >= 1);


    }
}

class IfElseLadder{
    public void disply(){
            int number1 = 72;
            int number3 = 11;
            int number2 = 22;

            if(number1 > number3 && number1 > number2){
                System.out.println("Num1 is greter");
                if(number1 % 2 ==0 ){
                    System.out.println("Num1 is greter & Even ");
                }
                else{
                    System.out.println("Num1 is greter & odd");
                }
            } else if (number2 > number1 && number2 > number2) {
                System.out.println("Num2 is greter");
            }
            else {
                System.out.println("Num3 is greter");
            }


    }
}
class SwitchCaseDemo{
    public void  display(){
        // SwitchStatement in jdk 1.5-- has feature string input
        String day = "7";
        String dayString;
        switch (day){
            case "7":
               dayString = "Monday";
            break;
            case "9":
                dayString = "Tuesday";
            break;
            case "5":
                dayString = "Wednesday";
            break;
            default:
                dayString = "Invalid";
        }
        System.out.println(dayString);
    }

}

public class ConditonStatement {
    public static void main(String[] args){
        SimpleIf obj = new SimpleIf();
        obj.disply();
        IfElseDemp obj1 = new IfElseDemp();
        obj1.disply();
        IfElseLadder obj3 = new IfElseLadder();
        obj3.disply();
        WhileDemo obj4 = new WhileDemo();
        obj4.display();
        Dowhile obj5 = new Dowhile();
        obj5.display();
        SwitchCaseDemo obj6= new SwitchCaseDemo();
        obj6.display();

    }
}
