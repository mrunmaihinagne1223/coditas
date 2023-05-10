abstract class shape{
    //abstract method
    abstract public void area();
}
class circle extends shape{

    @Override
    public void area() {
        System.out.println("This is area of circle");
    }
}
class square extends shape{

    @Override
    public void area() {
        System.out.println("This is square of circle");
    }
}

class Cylinder extends circle{
    public void areaOfcylinder(){
        super.area();
    }
}
class Rectangle extends square{
    public void areaOfrectangle(){
        super.area();
    }
}


public class Q4_Abstraction_Shapes {
    public static void main(String args[]){
        Cylinder cylinder = new Cylinder();
        cylinder.areaOfcylinder();
        Rectangle rectangle = new Rectangle();
        rectangle.areaOfrectangle();


    }

}
