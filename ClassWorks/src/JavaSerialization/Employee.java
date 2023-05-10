package JavaSerialization;
//Serialble
//

import java.io.Serializable;

public class Employee implements Serializable {
    int Id;
    String name,city;
    transient float salary;

    public Employee(int id, String name, String city, float salary) {
        Id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                '}';
    }
}
