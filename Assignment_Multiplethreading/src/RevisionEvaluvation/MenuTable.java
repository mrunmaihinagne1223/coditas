package RevisionEvaluvation;

public class MenuTable extends BookTable {

    String str[]={"Coffe","pizza","tea"};
    int price[]={100,200,300};
    Boolean falgg1 = false;


    public void displaymenu(){
        if(falgg){
            for (int i=0;i<str.length;i++)
            System.out.println( i+1 +":"+str[i]+":"+price[i]+"/-");
        }
    }

    int tablenumber;
    int serialno;
    int quantityno;
    int Continue ;
    int TotelNo;

    public boolean placdOrder() {
        System.out.println("What is your Table No ");
        tablenumber= sc.nextInt();

        System.out.println("Enter serial no of menu ");
        serialno = sc.nextInt();
        TotelNo = price[serialno-1]*quantityno;
        if(serialno==1){
            falgg1=true;
        }

        if(serialno > 3 ){
            try {
                throw new InVaildOrderEception();
            }
            catch (InVaildOrderEception e){
                System.out.println("Enter valid serial no enter using menu");
                displaymenu();
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
                falgg1=true;
            }

            System.out.println("Enter quantity no of menu ");
            quantityno = sc.nextInt();
            System.out.println("Continue order press 1 OR Exit enter 0");
            Continue = sc.nextInt();
            TotelNo =TotelNo+price[serialno-1]*quantityno;

        }


        if(Continue == 0){
            if(falgg1){
                exit();
                System.out.println("Your Total bill is "+TotalBill());
            }
            else {
                System.out.println("please order atlest one coffe");
            }


        }

        return  falgg1;

    }

    public int TotalBill(){


       return TotelNo;
    }

}
