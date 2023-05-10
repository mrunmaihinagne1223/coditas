package FileHandaling;

import java.io.*;

public class BufferReaderDemo2 {
    public static void main(String[] args) throws FileNotFoundException {


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Test1.text"));
            writer.write("IM DATA WRITEN USING BUFFERWRITER");
            writer.append("YOUR APPENDED ");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Test1.text"));
            int ch ;
            while ((ch = reader.read())!= -1){
                System.out.print((char) ch);
            }

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
