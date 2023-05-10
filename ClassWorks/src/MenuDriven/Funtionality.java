package MenuDriven;

import java.util.Scanner;

public class Funtionality {
    Scanner sc = new Scanner(System.in);

    public void fun1(){
        System.out.println("INNER LOOP 1");
        System.out.println("enter 1 inner 1");
        System.out.println("enter 2 inner 1");
        System.out.println("enter 0 inner 1");
        int chois = sc.nextInt();
        boolean falge1=true;
        switch (chois){
            case 1:
                System.out.println("IM 1 INSIDE");
                break;
            case 2:
                System.out.println("IM 2 INSIDE");
                break;
            case 0:
                falge1 = false;
                System.out.println("END OF INNER LOOP 1");
                break;

        }

    }
    public void fun2(){
        System.out.println("INNER LOOP 2");
        System.out.println("enter 1 inner 2");
        System.out.println("enter 2 inner 2");
        System.out.println("enter 0 inner 2");
        int chois = sc.nextInt();
        boolean falge1=true;
        switch (chois){
            case 1:
                System.out.println("IM 1 INSIDE");
                break;
            case 2:
                System.out.println("IM 2 INSIDE");
                break;
            case 0:
                falge1 = false;
                System.out.println("END OF INNER LOOP 2 ");
                break;

        }

    }
}
