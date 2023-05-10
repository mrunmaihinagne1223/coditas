class Address{
    //Constructor No return types because it class only
    int pno,fno,pincode;
    String name;

    public Address(int pno, int fno, int pincode, String name) {
        this.pno = pno;
        this.fno = fno;
        this.pincode = pincode;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pno=" + pno +
                ", fno=" + fno +
                ", pincode=" + pincode +
                ", name='" + name ;
    }


}
class Student{
    int id;
    String name;
    Address address;
    public Student(int id, String  name, Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
class Teacher  {
    int id;
    String name;
    Address address;
    public Teacher(int id, String  name, Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}




public class Q5_StudentTeacher {
    public static void main(String[] args) {
          Address address = new Address(12,67,7110,"Pune");
          Student student = new Student(1,"mrumai", address);
          Teacher teacher = new Teacher(1,"aarti",address);
        System.out.println(student);
        System.out.println(teacher);
    }
}
//Student{id=1, name='mrumai', address=Address{pno=12, fno=67, pincode=7110, name='Pune}
//Teacher{id=1, name='aarti', address=Address{pno=12, fno=67, pincode=7110, name='Pune}
//
//Process finished with exit code 0
