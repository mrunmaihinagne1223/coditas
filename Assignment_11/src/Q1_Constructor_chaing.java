class Student{
   Student(){

   }
   Student(String name){

   }
   Student(String name, int rollno){
       this();
       System.out.println("Name is "+name);
       System.out.println("rollno is "+rollno);
   }




}



public class Q1_Constructor_chaing {

    public static void main(String[] args) {
           Student student = new Student("Mrunmai", 89);


    }
}