import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectivity {
    static Connection connection(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eltp","root","Pass@123");
            System.out.printf("Connection done");
            return con;
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
