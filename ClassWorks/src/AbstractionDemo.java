//Aggargation
class Employee{
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address;
    }
}

public class AbstractionDemo {
    public static void main(String args[]){
        // Use independent class object first
        Address address1 = new Address(1,2,4100,"Pune");
        Employee employee = new Employee(1,"Mrunmai",address1);
        System.out.println(employee);
    }
}
