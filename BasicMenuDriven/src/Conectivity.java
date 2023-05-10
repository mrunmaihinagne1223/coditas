import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectivity {
    final static Connection connection() {
        Connection connection;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_Data", "root", "Pass@123");

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);

        }
        return connection;
    }



    }

