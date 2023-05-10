package ImageinDatabase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImageOpe {
    public void addImage(){

        Connection con =Conectivity.connection();
         try {

             File imageFile = new File("C:\\Users\\Coditas\\IdeaProjects\\Assignment_23\\src\\ImageinDatabase\\Image.jpg");
             FileInputStream fis;
            fis = new FileInputStream(imageFile);
             PreparedStatement ps =con.prepareStatement("INSERT INTO my_table (image_column) VALUES (?)");
             ps.setBinaryStream(1, fis, (int) imageFile.length());
             ps.executeUpdate();
         } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
             System.out.println(e);
         }




    }
}
