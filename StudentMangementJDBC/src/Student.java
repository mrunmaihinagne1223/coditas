import java.sql.*;
import java.util.Scanner;

public class Student {
    int stid,marks;
    String name,city;
    Connection conn = Conectivity.connection();
    Scanner sc = new Scanner(System.in);

     public void update(){
      System.out.println("Enter Name to update");
      String name = sc.nextLine();
      try {
       PreparedStatement pr = conn.prepareStatement("update student set name = ?  where stid = 2");
       pr.setString(1,name);
       pr.executeUpdate();
      } catch (SQLException e) {
       System.out.println(e);
      }
     }
     public void retrive (){
      try {
       Statement statement = conn.createStatement();
       ResultSet rs = statement.executeQuery("select name from teacher");
       while (rs.next()){
        System.out.println(rs.getString("name"));
       }
      } catch (SQLException e) {
       System.out.println(e);
      }

     }
     public void delete(){
      System.out.println("ENTER STID ");
      int ch = sc.nextInt();
      try {
       PreparedStatement pr1 = conn.prepareStatement("delete from student where stid = ? ");
       pr1.setInt(1,ch);
       pr1.executeUpdate();
      } catch (SQLException e) {
       System.out.println(e);
      }

     }
     public void insertStudent(){
      System.out.println("ENTER NAME");
      String name = sc.nextLine();
      System.out.println("ENTER STID");
      int stid = sc.nextInt();
      sc.nextLine();
      System.out.println("ENTER CITY ");
      String city = sc.nextLine();
      System.out.println("ENTER MARKS");
      int marks = sc.nextInt();

      try {
       PreparedStatement pr = conn.prepareStatement(" insert into student(name, stid, city, marks) values(?,?,?,?);");
       pr.setString(1,name);
       pr.setInt(2,stid);
       pr.setString(3,city);
       pr.setInt(4,marks);
      } catch (SQLException e) {
       System.out.println(e);
      }


     }
     public void findAllwithA(){


     }
     public void findTeacherslary(){

     }
     public void findjoin(){

     }
}
