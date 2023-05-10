package FileHandaling;

import JavaSerialization.Employee;

import java.io.*;
class employee  {
    String name,city;
    int Id;

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", Id=" + Id +
                '}';
    }

    public employee(String name, String city, int id) {
        this.name = name;
        this.city = city;
        Id = id;
    }


   }

public class BufferReaderDemo1 {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            BufferedOutputStream reader = new BufferedOutputStream(new FileOutputStream("Test.text"));
            String data = "IM DATA IN FILE";
            byte[] bytes = data.getBytes();
            reader.write(bytes);
            reader.close();
            reader.flush();   //
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        BufferedInputStream reader1 = new BufferedInputStream(new FileInputStream("Test.text"));
        try {
            int ch;
           while ((ch= reader1.read())!=-1){
               System.out.print((char) ch);
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
