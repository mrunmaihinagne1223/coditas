class Company{
    String s="Company";
    public  void display() {
        System.out.println(s);
    }

}
class Employee extends  Company{
    String s="Employee";
    public  void display() {
        System.out.println(s);
    }

}
class Asset extends Company{
    String s="Asset";
    public  void display() {
        System.out.println(s);
    }

}


public class Q4_ClassCastException {
    public static void main(String[] args) {
        Company company = new Company();
        Employee employee = new Employee();
        Asset asset = new Asset();
        {
            try {
                Company company1 = (Asset) company ;

            }
            catch (ClassCastException e){
                System.out.println("ClassCastException");
            }
            finally {
                System.out.println("Finally");
            }
       }

    }
}
