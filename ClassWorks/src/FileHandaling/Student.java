package FileHandaling;

import java.io.*;

public class Student implements Serializable {
    String name, city;
    transient int id;

    public Student(String name, String city, int id) {
        this.name = name;
        this.city = city;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", id=" + id +
                '}';
    }
}
