class Employee{
    int hrs;
    int rate;

    public void computeSalary(){
         int salary = hrs*rate;
        System.out.println("The employee salary : " + salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hrs=" + hrs +
                ", rate=" + rate +
                '}';
    }
}
class WageEmployee extends Employee{

     WageEmployee(int hrs, int rate){
        this.hrs=hrs;
        this.rate=rate;
        super.computeSalary();
    }


}

class SalaPerson extends  WageEmployee{
    int sales=0;
    int comission=0;


    SalaPerson(int sales, int comission, int hrs, int rate){
        super(hrs,rate);
        this.sales=sales;
        this.comission=comission;
         System.out.println("This by salary of SalePerson :"+sales*comission*hrs*rate);
    }

    @Override
    public String toString() {
        return "SalaPerson{" +
                "sales=" + sales +
                ", comission=" + comission +
                ", hrs=" + hrs +
                ", rate=" + rate +
                '}';
    }
}
class Manger extends Employee{
    int fixedsalary=0;
    int incentives=0;
    Manger(int fixedsalary, int incentives){
        this.fixedsalary = fixedsalary;
        this.incentives = incentives;
        System.out.println("Manger salary: "+ (fixedsalary+incentives));
    }

    @Override
    public String toString() {
        return "Manger{" +
                "fixedsalary=" + fixedsalary +
                ", incentives=" + incentives +

                '}';
    }
}



public class Q1_EmployeeWagd {

    public static void main(String args[]){
//        WageEmployee emp1 = new WageEmployee(6,100);
//        System.out.println(emp1);
//       SalaPerson person = new SalaPerson(1,10,6,100);
//        System.out.println(person);
//
//     Manger manger1 = new Manger(2,10);
//        System.out.println(manger1);
//
        Employee employee[] = new Employee[3];
        employee[0]=new Employee();
        employee[0].hrs=3;
        employee[0].rate=10;
        System.out.print("For employee[0] ");
        employee[0].computeSalary();




    }
}
