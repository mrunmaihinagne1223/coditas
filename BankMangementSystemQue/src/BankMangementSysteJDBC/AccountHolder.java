package BankMangementSysteJDBC;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AccountHolder {
    Scanner sc = new Scanner(System.in);
    String name;
    String address;
    String accountType;
    int phno;
    String emailId;
    long accountNo;
    static boolean falge1;
    int balance;
    public AccountHolder(String name, String address, int phno, String emailId, long accountNo) {
        this.name = name;
        this.address = address;
        this.phno = phno;
        this.emailId = emailId;
        this.accountNo = accountNo;
    }
    public AccountHolder(){}

    @Override
    public String toString() {
        return "AccountHolder{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phno=" + phno +
                ", emailId='" + emailId + '\'' +
                ", accountNo=" + accountNo +
                '}';
    }
     List<AccountHolder>listofAcc=new ArrayList<>();


    public void AddNewAccount(){

        System.out.println("Enter name");
        name=sc.nextLine();
        System.out.println("Enter phoneNo");
        phno=sc.nextInt();
        System.out.println("Enter AccountType");
        accountType=sc.nextLine();
        Random rc = new Random();
        accountNo = rc.nextLong() % 1000000000000L;
        accountNo=Math.abs(accountNo);
        falge1 = true;
        System.out.println("Your amount created "+name);
        System.out.println("Your amount num "+accountNo);
        listofAcc.add(new AccountHolder(name,address,phno,emailId,accountNo));


    }
    public void DepositeAmount(){
        System.out.println("ENTER DEPOSITE AMOUNT");
        int amount = sc.nextInt();
        balance+=amount;
        System.out.println("YOUR UPDATED BALANCE"+balance);
    }
    public  void WithdrawAmount(){
        System.out.println("ENTER WITHDRAW AMOUNT");
        int amount = sc.nextInt();

        if(amount<=balance && falge1){

            balance-=amount;

        }
        else {
            try {
                throw new InsifficientBalanceExaception();
            } catch (InsifficientBalanceExaception e) {

            }
        }

    }




    public void displayAccount(){
        System.out.println("CHECK ACCOUNT ENTER ACCOUNR NO");
        long actno= sc.nextLong();
        if(actno==accountNo){
           for (AccountHolder a : listofAcc){
               System.out.println(a);
           }

        }
        else {
            try {
                throw new AmountNotExitException();
            } catch (AmountNotExitException e) {

            }
        }

    }


}

