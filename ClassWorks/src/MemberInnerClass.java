class Outerone{
      static class Innerone{
        public void show(){
            System.out.println("Inner Class");
        }

    }
}
class Outerone11{
     static class Innerone11{
        public void show(){
            System.out.println("Inner Class");
        }

    }
}


public class MemberInnerClass {
    public static void main(String[] args) {
        // Way 1 to call show method
        Outerone11 outerone = new Outerone11();
        /*Without Making Innerclass obj and make inner class Static*/
        Outerone11.Innerone11 io = new Outerone11.Innerone11();

        io.show();

        // Way 2 to call show method
        Outerone obj = new Outerone();
        /*With Making Innerclass obj and make inner class NonStatic*/
        Outerone.Innerone obj1 = new Outerone.Innerone(); //Making obj of innerclass


    }
}
