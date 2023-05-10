abstract class Vehicals{
    // abstract method
    public abstract void display2() ;

}
class Car extends Vehicals{


    @Override
    public void display2() {
        System.out.println("car has good engine");
    }
}
class  Truck extends Vehicals{

    @Override
    public void display2() {
        System.out.println("truck has good engine");
    }
}


public class Q1_AbstractClassCreation {
     public static void main(String args[]){

         Car car = new Car();
         car.display2();
         Truck truck = new Truck();
         truck.display2();
     }
}
