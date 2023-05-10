class Randher{
    String grandParentName = "Randher";
    public void displayData(){
        System.out.println("grande parent enity nmae :: " + grandParentName);
    }
}
class Kareen extends  Randher{
    String Parentname = "Karena";
    public void displayData(){

        super.grandParentName="Babita";
        super.displayData();
        System.out.println(" parent name :: " + Parentname);
    }
}
class Taimur extends  Kareen{
    String childName = "Taimur";
    public void displayData(){
        super.displayData();
        System.out.println("child name :: " + childName);
    }
}
public class MultilevelInher {

    public static void main (String args[]){
         Taimur child = new Taimur();
         child.displayData();
    }
}
