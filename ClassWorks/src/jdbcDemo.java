

import java.io.IOException;
import java.sql.*;

public class jdbcDemo {
    public static void main(String[] args) throws IOException {

        try {
            //1: Loading Driver
            Class.forName("com.mysql.jdbc.Driver");

            //2: Establish Connection

            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/coditas_eltp","root","Pass@123");
            System.out.println("Connection done ");
            //3: Write Query : using statement
            Statement statement = connection.createStatement();
            System.out.println("Statement done ");
            //4: Resultset
            ResultSet resultSet=statement.executeQuery("Select*from Students1");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+"==="+resultSet.getString(2));
            }
            System.out.println("Done ");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}