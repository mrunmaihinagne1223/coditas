//class class1{
//    public static void main(String[] args) {
//            System.out.println("Hello 1");
//
//    }
//
//}
//
//class class2{
//    public static void main(String[] args) {
//        System.out.println("Hello 2");
//    }
//}
//
//class class3{
//    public static void main(String[] args) {
//        System.out.println("Hello 3");
//    }
//}

class Student{
    //private
    private int id;
    private String name,city;
    private float percentage;
    //public


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
class Rectangle {
    private int length;
    private int width;
    private int area;

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
                ", area=" + area +
                '}';
    }
}
class Parent1 {
    int drivinglinceId;
    public void displayData(){
        System.out.println("Parent DLID "+ drivinglinceId);
    }
}
class Child1 extends  Parent1{
    int addharId;
    public void displayData(){
        System.out.println("ChildAddhar ID "+ addharId);
        System.out.println("Child drivingLincesId "+ drivinglinceId);
    }
}


public class Main {
    public static void main(String[] args) {
//          Student obj = new Student();
//
//        Child1 child = new Child1();
//        child.drivinglinceId();
//          obj.setId(121);
//          obj.setName("Mrunmai");
//          obj.setCity("Pune");
//          obj.setPercentage(97);
//        System.out.println(obj);

//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(2);
//        rectangle.setLength(6);
//
//        System.out.println(rectangle.getArea());
//



    }
}