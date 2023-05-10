package FileHandaling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class   FileDemo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("filename.txt");
        file.createNewFile();

        FileWriter fw = new FileWriter("filename1.txt");
        fw.write("I HAVE WRITEN DATA USING FILEWRITER\n");
        fw.write("Add after close");
        fw.close();

        FileReader fr = new FileReader("filename1.txt");
        int ch;
        while ((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }







    }
}
