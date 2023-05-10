abstract class order{
    int memberid;
    String desrcption;
    public void display() {
        System.out.println(memberid + "Order placed");
    }
}
class PurschesOrder extends order{
  int  PurschesId;
    public void display() {
        System.out.println(PurschesId);
    }


}
class SaleOrder extends  order{
   int SaleOderId;
    public void display() {
        System.out.println(SaleOderId);
    }


}

public class Q2_AbstractClass {
    public static void main(String[] args) {
        PurschesOrder purschesOrder = new PurschesOrder();
        purschesOrder.display();




    }
}
