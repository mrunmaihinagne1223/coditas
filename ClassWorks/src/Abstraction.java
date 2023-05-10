// Concept which are not completed explain  --> Then use abstract class
//public void area(); --->>Missing method body, or declare abstract
//rule 1: In any simple clas if declear that method use add abstration
//rule 2: Abstract method in non-abstract class  Shape{
//    public  void area() {}--contrate metho
// rule 3 : You can declear abstar with single abstra method
// rule 4 : If any subclass wants to extends this abstrct
           // 4.1 => Implement all absrtract methode in child cls
           //4.2 ==> if not 4.2 then decleacr child cls as abstrct
// rule 5: You can instance an abstract class you can cretae an obj of an abstract class
abstract class Shape{
    //abstract
    public abstract void area() ;


    //constre method
    public void display(){
         System.out.println("Thid Shape display ");

    }

}
//Class 'Circle' must either be declared abstract or implement abstract method 'area()' in 'Shape'
class Circle extends Shape{


    @Override
    public void area() {
        System.out.println("Thid Circle display ");
    }
}



public class Abstraction {
     public static void main(String args[]){
         Circle circle = new Circle();
         circle.area();
     }




    }

