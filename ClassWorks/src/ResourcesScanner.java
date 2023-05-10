import java.util.Scanner;

public class ResourcesScanner {
    public static void main(String[] args) {
        System.out.println("***********ScanneClass***********");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name ? ");
        String name = scanner.nextLine();
        System.out.println("Hello  "+ name);

        System.out.print("Age ? ");
        int age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Alright its good"+ age);
        System.out.print("language ? ");
        String language = scanner.nextLine();
        System.out.println("Alright good choice "+language);


        scanner.close();
    }
}
