class Rectangle {
    private int l;
    private int b;
    private int h;

    public int getL() {
        return l;
    }

    public int getB() {
        return b;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getareaOfRectangle(){
       return  this.getB()*this.getL();
    }
    public int getPerimeterOfRectangel(){
        return 2*this.getH()+(this.getL()*this.getB());
    }

}

public class Q1_perimeter {
    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.setL(2);
    rectangle.setB(3);
    rectangle.setH(6);

        System.out.println("This is area of rectangle: "+rectangle.getareaOfRectangle());
        System.out.println("This is perimeter of rectangle: "+rectangle.getPerimeterOfRectangel());




    }
}


//This is area of rectangle: 6
//This is perimeter of rectangle: 18
//
//Process finished with exit code 0
// Correction done...