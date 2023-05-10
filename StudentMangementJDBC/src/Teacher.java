import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Teacher {
    int TID,salary,stid,exp;
    String name,city;
    Connection conn = Conectivity.connection();
    Scanner sc = new Scanner(System.in);

    public void update(){
        System.out.println("Enter Name to update");
        String name = sc.nextLine();
        try {
            PreparedStatement pr = conn.prepareStatement("update teacher set name = ? where tid =3");
            pr.setString(1,name);
            pr.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    }


