package ImageinDatabase;

import java.sql.Connection;

public class main {
    public static void main(String[] args) {
        Connection conn=Conectivity.connection();
        System.out.println("DONE");
        ImageOpe op = new ImageOpe();
        op.addImage();

    }
}
