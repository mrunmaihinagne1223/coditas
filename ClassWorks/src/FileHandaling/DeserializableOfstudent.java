package FileHandaling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableOfstudent {
    public static void main(String[] args) throws ClassNotFoundException {
        try {

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.txt"));
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
