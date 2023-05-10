import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Customer {
    String name;
    String emailId;
    String addresss;
    int aadharcard;
    String Simtype;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", addresss='" + addresss + '\'' +
                ", aadharcard=" + aadharcard +
                ", Simtype='" + Simtype + '\'' +
                ", month=" + month +
                '}';
    }

    static int balance = 100;
    static long mobilno;
    static int month = 1;


}

    class NewConnection extends Customer {


        public void PrepaidUser() {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number ");
            long num = sc.nextLong();

            if (num == mobilno) {


                System.out.println("Yours Number Is vaild ");

                System.out.println("enter0 :Exit ");
                System.out.println("enter1 :To Recharge ");


                int chosen = sc.nextInt();
                Boolean flage = true;
                while (flage) {
                    switch (chosen) {
                        case 0:
                            flage=false;
                            System.out.println("enter vaild");
                            break;
                        case 1:
                            System.out.println("how much to recharge  ");
                            int recharge = sc.nextInt();
                            if (recharge == 0) {
                                flage=false;
                                try {
                                    throw new RechargeAmountToLow();
                                } catch (RechargeAmountToLow e) {
                                    System.out.println();
                                }

                            } else {
                                balance += recharge;
                                System.out.println(balance);
                                month += 1;
                                System.out.println("Valid For moth " + month);
                                flage=false;


                            }
                            break;



                    }
                }
            }else {
                try {
                    throw new UserDoesnotExcesist();
                } catch (UserDoesnotExcesist e) {
                    System.out.println();
                }
            }

        }
        static ArrayList<Customer> listofCustomer = new ArrayList<>();
        public void newConnection() {



            Customer customer = new Customer();
            listofCustomer.add(customer);

            Scanner sc = new Scanner(System.in);
            boolean flage = false;

            System.out.println("enter name");
            customer.name = sc.nextLine();

            System.out.println("enter emailId ");
            customer.emailId = sc.nextLine();


            System.out.println("Enter Addhar ");
            customer.aadharcard = sc.nextInt();
            sc.nextLine();

            System.out.println("enter Simtype ");
            customer.Simtype = sc.nextLine();


            Random random = new Random();
            customer.mobilno = random.nextInt(900000000) + 1000000000;


            System.out.println("New connection Done Your mobile no is  = " + mobilno);
            System.out.println(customer);


        }

        public void displayfuntion(){
            for (Customer c : listofCustomer){
                System.out.println(c);
            }
        }
    }










