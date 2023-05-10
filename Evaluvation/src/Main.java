import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("STUDENT MANGEMENT");
        boolean flage = true;
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        Teacher teacher = new Teacher();


        while (flage){

            System.out.println("ENTER 1 : RETRIVERLA \n ENTER 2: UPDATE \n ENTER 3:DELETION \n ENTER 4:iNSERTION");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("ENTER 1:Student retrvival\nENTER 2:Teacher retrvival");
                    int ch1 = sc.nextInt();
                    if(ch1==1){
                        student.displayStudent();
                    }
                    else {
                        teacher.displayTeacher();
                    }

                   break;
                case 2:
                    System.out.println("DELET STUDENT");
                    student.deleteStudent();
                    break;
                case 3:
                    System.out.println("UPDATE STUDENT");;
                    student.updateStuden();
                    break;
                case 4:
                    System.out.println("ADD STUDENT");
                    student.addStudent();
                    break;
                case 0:
                    break;
            }

        }




    }
}