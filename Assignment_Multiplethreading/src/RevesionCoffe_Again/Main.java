package RevesionCoffe_Again;


import RevisionEvaluvation.MenuTable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcom Student");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1: BookTable");
        System.out.println("Enter 2: DisplayMenu");
        System.out.println("Enter 3: PlaceOrder ");
        System.out.println("Enter 0: Exit");

        boolean flage = true;
        while (flage){

            System.out.println("Enter our choise ");
            int chosen = sc.nextInt();

            BookTable bookTable = new BookTable();
            Thread thread1 = new Thread(bookTable);

            DisplayMenu displayMenu = new DisplayMenu();
            Thread thread2 = new Thread(displayMenu);

            PlaceOrder menuTable = new PlaceOrder();
            Thread thread3 = new Thread(menuTable);

            switch (chosen) {
                case 1:
                    thread1.start();
                    thread1.join();
                    break;
                case 2:
                    thread2.start();
                    thread2.join();
                    break;
                case 3:
                    thread3.start();
                    thread3.join();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invaild Input");


            }

        }



    }

}
