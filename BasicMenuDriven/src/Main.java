import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("MENU DRIVEN ");
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        Techers techers= new Techers();



        boolean flage = true;
       while (flage){
           System.out.println("ENTER 1 ADD STUDENT \n ENTER 2 ADD TEACHER \n ENTER 3 UPDDATE \n DELETE");
           int ch = sc.nextInt();
           switch (ch){
               case 1:
                  student.AddStudent();
                   break;
               case 2:
                   techers.AddTechaer();
               case 3:
                   System.out.println("ENTER 1 FOR UPDATE student Marks \n ENTER 2 FOR UPDATE teacher salary ");
                   int ch1= sc.nextInt();
                   if(ch1==1){
                   student.updateStudent();
                   }
                   else {
                       techers.updateTeacher();
                   }
                   break;
                   case 0:
                   //updation
                   flage=false;
                   break;
               default:
                   flage=false;
                   break;

           }
       }



    }
}