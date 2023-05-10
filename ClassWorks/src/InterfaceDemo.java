
class interfaceDemo implements ShapeInterface{
    int length, breath, area=0;
    @Override
    public void ares() {

        area=length*breath;
    }

    @Override
    public void display() {
        ShapeInterface.super.display();
    }
}
 abstract class Dog implements Animal{

}



public class InterfaceDemo {
     public static  void main(String args[]) {
         ShapeInterface.show(); // satic method to access in interfaceDemo
     }
}

