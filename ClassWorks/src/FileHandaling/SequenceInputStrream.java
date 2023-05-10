package FileHandaling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SequenceInputStrream {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("filename.txt");
            FileOutputStream fileOutputStream1 = new FileOutputStream("output.txt");
            SequenceInputStrream sequenceInputStrream = new SequenceInputStrream();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
