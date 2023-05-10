interface Shape{
    void Area();
}
public class AnonymousClass {
    public static void main(String[] args) {
        Shape shape = new Shape() {
            @Override
            public void Area() {
                System.out.println("OversideShapes");
            }
        };
        shape.Area();
    }
}