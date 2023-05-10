package BankMangementSysteJDBC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Bank ");
        Scanner sc = new Scanner(System.in);
        boolean falge = true;
        AccountHolder accountHolder = new AccountHolder();

        while (falge){
            System.out.println("0 FOR EXIT\n1 ADD NEW ACCOUNT \n2 DOPSITE AMOUNT \n3 WITHDRAW AMOUNT \n4 DISPLAY ACCOUNT DETAILES");

            int choise= sc.nextInt();
            switch (choise){
                case 0:
                    falge=false;
                    System.out.println("Exit Program");
                    break;
                case 1:
                    accountHolder.AddNewAccount();
                    break;
                case 2:
                    accountHolder.DepositeAmount();
                    break;
                case 3:
                    accountHolder.WithdrawAmount();
                    break;
                case 4:
                    accountHolder.displayAccount();
                    break;
                default:
                    break;
            }

        }




    }
}