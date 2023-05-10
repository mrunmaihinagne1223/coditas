package web;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("BOOK MANAGEMENT SYSTEM");
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        boolean flag = true;
        while (flag) {
            System.out.println("\nENTER 1: ");
            System.out.println("ENTER 2: ");
            System.out.println("ENTER 3: ");
            System.out.println("ENTER 4: ");
            System.out.println("ENTER 5 : ");
            System.out.println("ENTER 9 : ");
            System.out.println("ENTER 0: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    break;
                case 2:
                    //TODO: Implement update

                    break;
                case 3:
                    //TODO: Implement delete

                    break;
                case 4:
                    //TODO: Implement show

                    break;
                case 5:

                    break;
                case 6:

                case 7:

                case 8:

                break;

                case 9:

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
