public interface ShapeInterface {
   //abstre method
    public void ares();
   // void display(){} --> error Interface abstract methods cannot have body
   //default methode
   int a=5;//public static final
   default void display(){

   }
   //static method
   static void show(){
      System.out.println("Satic method show()");
   }


}


