package LamdaExample;
interface Shape{
    int area(int a);
}

public class main {
    public static void main(String[] args) {
        Shape shape = (int a) -> {
           return a+5;
        };
        System.out.println(shape.area(7));

        }
}
