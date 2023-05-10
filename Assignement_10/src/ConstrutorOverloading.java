
class Rectangle1 implements NewShape {
   int l,b;
     Rectangle1(){
        int l=0;
        int b=0;
    }
    Rectangle1(int l, int b){
         this.l=l;
         this.b=b;

    }
    @Override
    public void getArea()  {
        System.out.println("Area of reactangle: "+ l*b);
    }

    @Override
    public String toString() {
        return "Rectangle1{" +
                "l=" + l +
                ", b=" + b +
                '}';
    }
}
class Triangle1 implements NewShape{
    int base,height;
   Triangle1(){
       base=0;
       height=0;
   }
   Triangle1(int base, int height){
       this.base=base;
       this.height=height;
   }
    @Override
    public void getArea() {
        System.out.println("Area of Triangle"+ base*height);
    }

    @Override
    public String toString() {
        return "Triangle1{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}

public class ConstrutorOverloading {
    public static void main(String[] args) {
       NewShape rectangle = new Rectangle1(2,5);
       rectangle.getArea();
       NewShape triangle = new Triangle1(4,8);
       triangle.getArea();



    }
}
