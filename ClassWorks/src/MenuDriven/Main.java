package MenuDriven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funtionality funtionality = new Funtionality();

        boolean flage = true;
        while (flage){
            System.out.println("OUTER LOOP");
            System.out.println("enter 1 outerloop");
            System.out.println("enter 2 outerloop");
            System.out.println("enter 0 outerloop");
            int chois = sc.nextInt();
            switch (chois){
                case 1:
                    funtionality.fun1();
                    break;
                case 2:
                    funtionality.fun2();
                    break;
                case 0:
                    flage=false;
                    break;

            }

        }

    }
}
