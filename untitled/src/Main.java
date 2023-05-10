class Calculation{
    int number1=2, number2=3;
    public void add(){
        int addresult = number1+number2;
        System.out.println(addresult);
    }
    public void sub(){
        int subresult = number1-number2;
        System.out.println(subresult);
    }

    public void mult(){
        int multresult = number1*number2;
        System.out.println(multresult);
    }
    public void div(){
        int divresult = number1/number2;
        System.out.println(divresult);
    }


}
class lightT {
    public void display(int row, int column) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public void display2(int row, int column){
        for(int i = 1; i<= row; i++){
            for(int j = 1; j<=row-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void display22(int row, int column){
        for(int i = 1; i<= row; i++){
            for (int j=1; j<=i-1;j++){
                System.out.print("  ");
            }
            for(int j = i; j<=row; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public void display3rec(int row, int column){
        for(int i = 1; i<= row; i++){
            for(int j = 1; j<=row-i; j++){
                System.out.print("* ");
            }
            for (int j=1; j<=row;j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public void display32rec(int row, int column){
        for(int i = 1; i<= row; i++){
            for(int j = 1; j<=row-i; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }

class Parent {
        int drivinglinceId;
        public void displayData(){
            System.out.println("Parent DLID "+ drivinglinceId);
        }
}
class Child extends  Parent{
        int addharId;
    public void displayData(){
        System.out.println("ChildAddhar ID "+ addharId);
        System.out.println("Child drivingLincesId "+ drivinglinceId);
    }
}


}
public class Main {
    public static void main(String[] args)
    {
       // System.out.println("Hello world!");

//        Calculation c = new Calculation();
//        c.sub();
//        c.mult();
//        c.div();
//        c.add();
        //  lightT star = new lightT();
      // star.display(5,5);
       //  star.display2(5,5);
          //star.display22(5,5);
       //   star.display3rec(5,5);
       // star.display32rec(5,5);
//        int i = 0;
//        while (i<= 10){
//
//            i++;
//            if(i == 6){
//                continue;
//            }
//            System.out.println("values of i : "+i);
//
//        }
//        // array decleartion
//        int a[] = {1,2,3,4,5,6,7};
//        int a1[] = new int[5];
        Child child = new Child();


    }
}