import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO COLLEGE MANGEMENT");
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        Teacher teacher = new Teacher();
        boolean flage = true;
        while (flage){
            System.out.println(" ENTER 1 : UPDATE   \n ENTER 2 : RETRIVE STUDENT  \n ENTER 3 : DELETE STUDENT \n ENTER 4 : INSERT STUDENT " +
                    "\n ENTER 5 : FIND STUDENTS WITH NAME START WITH A \n ENTER 6 : FIND TEACHER SALARY EXP WISE \n ENTER 7 :  FIND TEACHER CITY WITH PUNE AND NAME START WITH A");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("ENTER 1  UPDATE STUDENT \n ENTER 2 UPDATE TEACHER ");
                    int sr = sc.nextInt();
                    if(ch == 1){
                    student.update();
                    }
                    else {
                    teacher.update();
                    }
                    break;
                case 2:
                    student.retrive();
                    break;
                case 3:
                    student.delete();
                    break;
                case 4:
                    student.insertStudent();
                    break;
                case 5:
                    student.findAllwithA();
                    break;
                case 6:
                    student.findTeacherslary();
                    break;
                case 7:
                    student.findjoin();
                    break;
                case 0:
                    flage=false;
                    System.out.println("EXIT");
                    break;

            }
        }


    }
}
