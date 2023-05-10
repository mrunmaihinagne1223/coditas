import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Student {
    int Id, marks;
    String name, city;

    Student() {
    }
     Scanner sc = new Scanner(System.in);
     Connection con = Conectivity.connection();



    public void AddStudent() {
        System.out.println("ENTER STUDENT ID");
        Id = sc.nextInt();
        sc.nextLine();
        System.out.println("ENTER NAME");
        name = sc.nextLine();
        System.out.println("ENTER DIVISION");
        city = sc.nextLine();
        System.out.println("ENTER AGE");
        marks = sc.nextInt();
        System.out.println("CONTECTION DONE");
        try {
            PreparedStatement pr = con.prepareStatement(" insert into  students1 values(?,?,?,?);");
            pr.setInt(1, Id);
            pr.setString(2, name);
            pr.setString(3, city);
            pr.setInt(4, marks);
            pr.executeUpdate();
            System.out.println("ADD student");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            }

        }
        public void updateStudent(){

            PreparedStatement pr1= null;
            try {
                pr1 = con.prepareStatement("update student1 set subject= ? where stid= ?;");
                pr1.setString(1,"Maths");
                pr1.setInt(2,1);
                pr1.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


        }
    }
