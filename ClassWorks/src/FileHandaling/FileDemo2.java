package FileHandaling;
import java.io.*;
public class FileDemo2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("filename.txt");
            String data = "INPUT DATA USING FILE OUTPUT\n WHICH ACCEPT ONLY BYTE VALUES";
            byte[]bytes=data.getBytes();
            fileOutputStream.write(bytes);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream inputStream = new FileInputStream("output.txt");
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
