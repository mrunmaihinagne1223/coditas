

class Shape{
    int area(int length, int breath){
        return length*breath;
    }
}
class Rectangle extends Shape{
    int height;
    int area;

    public Rectangle(int length, int breath, int height){
        this.height=height;
        this.area=area(length,breath);

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", area=" + area +
                '}';
    }
}



public class Q4_ParameterizedConstrutor {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12,88,9);
        System.out.println(rectangle);
    }

}
