package JavaSerialization;

import java.io.*;


public class SerializationDemo  {

    public static void main(String[] args) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Employee1.txt"));
            Employee employee = new Employee(11,"yash","agra",456.34f);
            objectOutputStream.writeObject(employee);
            System.out.println("done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        }


}
//Withtransient
//�� sr JavaSerialization.EmployeeM8O2AN�� I IdL cityt Ljava/lang/String;L nameq ~ xp   t agrat yash
//Without transient
//�� sr JavaSerialization.Employee�٬�c�z� I IdF salaryL cityt Ljava/lang/String;L nameq ~ xp   C�+�t agrat yash