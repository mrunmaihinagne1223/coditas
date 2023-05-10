package callCenterJDBC;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO CALL CENTER");
        Scanner sc = new Scanner(System.in);
        Users users = new Users();

        boolean flage = true;
        while (flage){
            System.out.println("ENTER 1 FOR PREPAID CONNECTION\nENTER 2 FOR NEW CONNECTION\n"+
                    "ENTER 3 DISPLAY USERS\nENTER 0 TO EXIT");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    users.prepaid();
                    break;
                case 2:
                    users.NewConnection();

                    break;
                case 3:
                    users.display();
                    break;
                case 4:
                    users.alredyExist();
                    flage=false;
                    break;
                case 0:
                    flage=false;
                    break;
            }

        }


    }
}
