class GretestNum{

    public int getlargeset (int number1, int  number2, int number3){

        if(number1 > number2 && number1 > number3 )   return number1;

        if(number2 > number1 && number2 > number3 )   return number2;

        return number3;

    }
}


public class Q5 {

    public static void main(String args[]){
      GretestNum obj = new GretestNum();
      System.out.println("Largest num is : "+(obj.getlargeset(3,4,7)));

    }
}

// Output of Q5
// => Largest num is : 7
