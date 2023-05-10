import java.util.Scanner;

public class Q6 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ages");
        int age1 = sc.nextInt();
        int age2 = sc.nextInt();
        int age3 = sc.nextInt();
        int o = 0;
        int y  = 0;
        if(age1 > age2 && age1 > age3){
           o=age1;
        }
        else if (age2 > age1 && age2 > age3) {
            o=age2;
        }
        else {
            o=age3;
        }
        if(age1 < age2 && age1 < age3){
            y=age1;
        } else if (age2 < age1 && age2 < age3) {
            y=age2;
        }
        else {
            y=age3;
        }

        System.out.println("The Oldest: " + o);
        System.out.println("The Yougest: "+ y);

    }
}

// Output Q5
//