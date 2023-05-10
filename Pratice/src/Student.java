import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Student {
    Connection connection = Conectivity.connection();
    Scanner sc = new Scanner(System.in);
    String name,city;
    int stid, marks;
    public void addstudent(){
        System.out.println("NAME ?");
        name = sc.nextLine();
        System.out.println("STID ?");
        stid = sc.nextInt();
        sc.nextLine();
        System.out.println("CITY ?");
        city=sc.nextLine();
        System.out.println("MARKS ?");
        marks=sc.nextInt();

        System.out.println();
        try {
            PreparedStatement pr = connection.prepareStatement("insert into student (name, stid, city, marks) values (?,?,?,?);");
            pr.setString(1,name);
            pr.setInt(2,stid);
            pr.setString(3,city);
            pr.setInt(4,marks);
            pr.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }


    }
}
