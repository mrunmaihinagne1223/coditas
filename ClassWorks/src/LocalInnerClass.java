class Outerone1{
    public void display() {
        System.out.println("Its a display method and ha inner");
        class Innerone1 {
            public void show() {
                System.out.println("Inner Class show method ");
            }

        }
        Innerone1 io = new Innerone1();
        io.show();
    }


}
public class LocalInnerClass {
    public static void main(String[] args) {
        Outerone1 outerone = new Outerone1();
       outerone.display();









    }
}
