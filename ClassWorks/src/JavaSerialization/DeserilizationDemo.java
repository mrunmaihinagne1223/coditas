package JavaSerialization;

import java.io.*;

public class DeserilizationDemo {
    public static void main(String[] args) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Employee1.txt"));
            Employee employee = (Employee) objectInputStream.readObject();
            System.out.println(employee);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
