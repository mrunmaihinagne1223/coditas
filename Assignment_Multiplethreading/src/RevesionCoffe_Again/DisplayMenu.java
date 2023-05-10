package RevesionCoffe_Again;

public class DisplayMenu extends BookTable implements Runnable{


    @Override
    public void run() {
        if(falgg){
            String str[]={"Coffe","pizza","tea"};
            int price[]={100,200,300};
            for (int i=0;i<str.length;i++)
                System.out.println( i+1 +":"+str[i]+":"+price[i]+"/-");
        }
        else {
            System.out.println("Enter Vaild Serial No");
        }


    }

}
