import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Teacher {
    int TID,salary,stid;
    String name,city;
    Connection con = Conectivity.connection();
    Scanner sc = new Scanner(System.in);
    public void displayTeacher(){
        System.out.println("ENTER TID OF STUDENT ");
       TID=sc.nextInt();
        try {
            PreparedStatement pr = con.prepareStatement("SELECT * FROM teacher WHERE stid = ?");
            pr.setInt(1, stid);
            ResultSet rs = pr.executeQuery();
            while (rs.next()){
                TID= rs.getInt("stid");
                name =rs.getString("name");
                city=rs.getString("city");
                System.out.println(TID+"==="+name+"==="+city);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        public void


    }
}
