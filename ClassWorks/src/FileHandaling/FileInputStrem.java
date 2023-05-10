package FileHandaling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileInputStrem {
    public static void main(String[] args)throws IOException {
        try {
            FileInputStream fp = new FileInputStream("Abc.txt");
            System.out.println(fp.read());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}
