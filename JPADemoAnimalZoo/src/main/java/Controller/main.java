package Controller;
import dao.DaoImpl;
import model.Customer;
import model.Product;
import model.Shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException, SQLException, ParseException {
        System.out.println("BOOK MANAGEMENT SYSTEM");

        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DaoImpl daoImpl=new DaoImpl();


        boolean flag = true;
        while (flag) {
            System.out.println("1.Insert Shop & Customer ");
            System.out.println("5.Insert Product ");
            System.out.println("3.Mapping Insertion");
            System.out.println("4.Expered customer ");
            System.out.println("5. All customer starting A and shop Id=1");
            System.out.println("6. All product datewise  ");
            System.out.println("7.All Animal who age greter than enter value");
            System.out.println("8.All Animals whos catagory is: ");
            System.out.println("9.All Animals date range");
            System.out.println("10.All book according to publisher_name");

            int choice = scanner.nextInt();
            switch (choice) {

                case 1:
                   daoImpl.inser();
                    break;
                case 2:
                    daoImpl.insertProduct();
                    break;
                case 3:
                    daoImpl.insertMappingInsert();
                    break;
                case 4:
                    daoImpl.getExpiredCustomers();
                    break;
                case 5:
                    daoImpl.getCustomersNameStartingA();
                    break;
                case 6:
                    daoImpl.getProductDateRange();
                    break;
                case 7:
                    daoImpl.getCustomersAndProducts();
                    break;
                case 8:
                    daoImpl.getProductsIn();
                    break;
                case 9:
                    int sumId=daoImpl.sumProductIds();
                    System.out.println(sumId);
                    break;
                case 10:

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
