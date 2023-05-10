import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcom to school!");

        System.out.println("Enter 1: AddStudent\nEnter 2: DisplayStudents\nEnter 3: DisplayMarksheet \nEnter 0: Exit");


        boolean flage = true;
        while (flage){


             AddStudent addStudent = new AddStudent();
             Thread t1 =  new Thread(addStudent);







            System.out.println("Enter our choise ");
            int chosen = sc.nextInt();

            switch (chosen) {
                case 1:
                  t1.start();
                  t1.join();
                  break;
                case 2:
                    addStudent.diplaystudents();
                   break;
                case 3:
                    addStudent.displaymarksheet();
                    break;
                case 0:
                    System.out.println("Exit");
                    flage = false;
                    break;
            }


        }



    }
}