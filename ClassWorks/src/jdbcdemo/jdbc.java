package jdbcdemo;

import java.sql.*;

public class jdbc {
    public static void main(String[] args) {
        Connection connection;
        Statement st;

        PreparedStatement pr;
        ResultSet resultSet ;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection1=DriverManager.getConnection("jdbc:mysql://localhost:3306/coditas_eltp","root","Pass@123");
            System.out.println("connect");
          pr =connection1.prepareStatement("insert into student (stid, name, division, age) values (?,?,?,?);");
//            int nuber = preparedStatement.executeUpdate();
//            System.out.println("result"+nuber);
             //preparedStatement =connection1.prepareStatement("insert into Students1 values(?,?)");
             pr.setInt(1,11);
             pr.setString(2,"Sakshi");
             pr.setString(3,"A");
             pr.setInt(4,66);
            pr.executeUpdate();
             System.out.println("inserted row");
         pr=connection1.prepareStatement("update student set division = ? where stid = ? ;");
         pr.setString(1,"A");
         pr.setInt(2,4);
         pr.executeUpdate();
            System.out.println("UPdation done");
        st=connection1.createStatement();
        ResultSet rs = st.executeQuery(" select*from student");

        while (rs.next()){
            System.out.println("stid : "+rs.getInt("stid")+"name : "+rs.getString("name")+
                    "division : "+rs.getString("division")+ "Age : "+rs.getInt("age"));
        }
            System.out.println("DOne");
        st = connection1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs=st.executeQuery("select*from student where stid = 10");
        while (rs.next()){
            rs.updateString("division","A");
            rs.updateRow();

        }
            System.out.println("Done 2");



        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        catch (SQLException e) {
            System.out.println(e);;
        }

    }
}
