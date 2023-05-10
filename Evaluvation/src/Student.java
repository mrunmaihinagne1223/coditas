import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Student {
    int stid,marks;
    String name,city;
    Connection con = Conectivity.connection();

     Scanner sc = new Scanner(System.in);
    public void displayStudent(){
        System.out.println("ENTER STID OF STUDENT ");
        stid=sc.nextInt();
        try {
            PreparedStatement pr = con.prepareStatement("SELECT * FROM student WHERE stid = ?");
            pr.setInt(1, stid);
            ResultSet rs = pr.executeQuery();
            while (rs.next()){
                name =rs.getString("name");
                stid= rs.getInt("stid");

                System.out.println(stid+"==="+name);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }


    }
   public void deleteStudent(){
       PreparedStatement pr2= null;
       try {
           pr2 = con.prepareStatement(" DELETE FROM student WHERE stid = ?");

           pr2.setInt(1,3);
           pr2.executeUpdate();
       } catch (SQLException e) {
           System.out.println(e);
       }


   }
   public void updateStuden(){
       PreparedStatement pr1= null;
       try {
           pr1 = con.prepareStatement("update  student set city =? where stid =?");
           pr1.setString(1,"Maharata");
           pr1.setInt(2,1);
           pr1.executeUpdate();
       } catch (SQLException e) {
           System.out.println(e);
       }
       System.out.println("UPDATION done");


   }
   public void addStudent(){
        System.out.println("ENTER NAME");
        String name=sc.nextLine();
        System.out.println("ENTER STID");
        int stid = sc.nextInt();
        sc.nextLine();
        System.out.println("ENTER CITY");
        String city = sc.nextLine();
        System.out.println("ENTER MARKS");
        int marks=sc.nextInt();
       try {
           PreparedStatement pr = con.prepareStatement("insert into student(name, stid, city, marks) values(?,?,?,?)");
           pr.setString(1,name);
           pr.setInt(2,stid);
           pr.setString(3,city);
           pr.setInt(4,marks);
       } catch (SQLException e) {
           System.out.println(e);
       }

   }
}
