abstract class Shapes{
    abstract void area();


}
interface Animals{
    void legs();
}



public class AnoymsClass {
    public static void main(String[] args) {
        Shapes shapes = new Shapes() {
            @Override
            void area() {

            }
        };
        Animals animals = new Animals() {
            @Override
            public void legs() {

            }
        };

    }
}
