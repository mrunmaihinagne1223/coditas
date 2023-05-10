class Triangle extends Shape{
    @Override
    public void calculate_Area(int length, int breath) {
      System.out.println("Its the triangle");
    }
}
class Circle extends Shape{
    @Override
    public void calculate_Area(int length, int breath) {
        System.out.println("Its the Circle");
    }
}
class Rectangle extends Shape{
    @Override
    public void calculate_Area(int length, int breath) {
        System.out.println("Its the Rectangle");
    }
}



public class Q2Overriding {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        triangle.calculate_Area(12,7);
        //triangle.calculate_Area(12,7,5);

        Triangle triangle1 = new Triangle();
        triangle1.calculate_Area(8,9);


    }
}
