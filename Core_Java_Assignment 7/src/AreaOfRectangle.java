class Rectangle {
    private int length;
    private int width;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {

        return this.getLength()*this.getWidth();
    }
    //To string


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +

                '}';
    }
}


public class AreaOfRectangle {
    public static void main(String args[]){
    Rectangle rectangle = new Rectangle();
        rectangle.setWidth(2);
        rectangle.setLength(6);

        System.out.println(rectangle.getArea());}

}

