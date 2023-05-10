package FileHandaling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderforStudents {
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter Name ");
            String name = bufferedReader.readLine();
            System.out.println("enter city");
            String city =bufferedReader.readLine();
            System.out.println("Enter Id");
            int id = bufferedReader.read();
            Student student = new Student(name,city,id);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
