package web;
import model.Account;
import model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException, SQLException {
        System.out.println("BOOK MANAGEMENT SYSTEM");

        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Account account = new Account();
        Bank bank = new Bank();
        User user = new User();

        boolean flag = true;
        while (flag) {

            System.out.println("1.  ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.  ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 0:
                    flag = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
