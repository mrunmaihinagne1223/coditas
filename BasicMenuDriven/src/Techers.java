import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Techers extends Student {
    int TId,salary;
    String name,city;
    Techers(){

    }
    Student s1=new Student();
    Techers t1=new Techers();
    Scanner sc = new Scanner(System.in);
    Connection con = Conectivity.connection();

    public void AddTechaer() {

        System.out.println("ENTER Teacher ID");
        TId = sc.nextInt();
        sc.nextLine();
        System.out.println("ENTER STUDENT ID");
        int stid = sc.nextInt();
        sc.nextLine();
        System.out.println("ENTER NAME");
        name = sc.nextLine();
        System.out.println("ENTER CITY");
        city = sc.nextLine();
        System.out.println("ENTER AGE");
        salary = sc.nextInt();
        System.out.println("CONTECTION DONE");
        try {
            PreparedStatement pr = con.prepareStatement("insert into  techers1(TID,stid,name,city,salary)values(?,?,?,?,?);");
            pr.setInt(1, TId);
            pr.setInt(2,stid);
            pr.setString(2, city);
            pr.setInt(4, salary);

            pr.executeUpdate();
            System.out.println("ADD student");
        } catch (SQLException e) {
            if (e.getMessage().equals("Duplicate entry '2' for key 'student.PRIMARY'")) {
                System.out.println("DuplicateStudentException");
            }
            //System.out.println(e.getMessage());
        }
    }
    public void updateTeacher(){

        PreparedStatement pr1= null;
        try {
            pr1 = con.prepareStatement(" update techers1 set salary=? where TID=1;");
            pr1.setInt(1,2000);
            pr1.setInt(2,1);
            pr1.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
