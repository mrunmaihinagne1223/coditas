import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        boolean flage = true;
        while (flage) {

            System.out.println("Enter 1: Prepaid User ");
            System.out.println("Enter 2: New Connection ");
            System.out.println("Enter 1: Views All User ");


            NewConnection customer = new NewConnection();
            System.out.println("Enter our choise ");
            int chosen = sc.nextInt();

            switch (chosen) {
                case 1:
                    customer.PrepaidUser();
                    break;
                case 2:
                    customer.newConnection();
                    break;
                case 3:
                    customer.displayfuntion();
                    break;
                case 0:
                    flage =false;
                    System.out.println("Exit");
                    break;
                default:
                    flage=false;
                    System.out.println("Plese Enter 0 to 3");

                    break;

            }

        }

    }
}