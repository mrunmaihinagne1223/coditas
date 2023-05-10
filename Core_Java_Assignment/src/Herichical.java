class Parents{
    String Partename = "RAVI";
    public void displayData(){
        System.out.println("Parent DLID "+ Partename);
    }
}
class BoyChild extends  Parents{
    String Boyname = "Manna";
    public void displayData(){

        System.out.println("Boyname DLID "+ Boyname);
        System.out.println("Parent name : " + super.Partename);
    }

}
class Girlchild extends Parents{
    String Girlname = "Payal";
    public void displayData(){
        System.out.println("Girlname DLID "+ Girlname);
        System.out.println("Parent name : " + super.Partename);
    }


        }


public class Herichical {

    public static void main(String[] args){

        Girlchild girl = new Girlchild();
        girl.displayData();

        BoyChild boy = new BoyChild();
        boy.displayData();


    }
}
//Girlname DLID Payal
//Parent name : RAVI
//Boyname DLID Manna
//Parent name : RAVI