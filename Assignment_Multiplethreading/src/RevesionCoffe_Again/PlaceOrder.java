package RevesionCoffe_Again;

import RevisionEvaluvation.InVaildOrderEception;

import java.util.Scanner;

public class PlaceOrder extends DisplayMenu implements Runnable{

    static int  tablenumber;
    static int serialno;
    static int quantityno;
    static int TotelNo;
    int Continue;

    boolean flagCoffe = false;

     String str[]={"Coffe","pizza","tea"};
       int price[]={100,200,300};

    @Override
    public void run() {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your Table No ");
        tablenumber= sc.nextInt();

        System.out.println("Enter serial no of menu ");
        serialno = sc.nextInt();
        TotelNo = price[serialno-1]*quantityno;
        if(serialno==1){
            flagCoffe=true;
        }

        if(serialno > 3 ){
            try {
                throw new InVaildOrderEception();
            }
            catch (InVaildOrderEception e){
                System.out.println("Enter valid serial no enter using menu");

            }





            System.out.println("Enter correct serial no of menu ");
            serialno = sc.nextInt();
        }


        System.out.println("Enter quantity no of menu ");
        quantityno = sc.nextInt();

        System.out.println("Enter 0 end order & 1 to continoue order");
        Continue = sc.nextInt();
        if (Continue==1){
            System.out.println("Enter serial no of menu ");
            serialno = sc.nextInt();
            if(serialno==1){
                flagCoffe=true;
            }

            System.out.println("Enter quantity no of menu ");
            quantityno = sc.nextInt();
            System.out.println("Continue order press 1 OR Exit enter 0");
            Continue = sc.nextInt();
            TotelNo =TotelNo+price[serialno-1]*quantityno;

        }


        if(Continue == 0){
            if(falgg){

                System.out.println("Your Total bill is "+TotalBill());
            }
            else {
                System.out.println("please order atlest one coffe");
            }


        }




    }

    public int TotalBill(){


        return TotelNo;
    }










    }



