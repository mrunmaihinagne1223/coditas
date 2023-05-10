import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcom Student");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1: Check Eligibilty and Book exam");
        System.out.println("Enter 2: Display Exam Schedule");
        System.out.println("Enter 3: Regularization");
        System.out.println("Enter 0: Exit");

        boolean flage = true;
        while (flage) {

            CheckAvailbilty checkAvailbilty = new CheckAvailbilty();
            Thread thread1 = new Thread(checkAvailbilty);

            DisplayExamdate displayExamdate = new DisplayExamdate();
            Thread thread2 = new Thread(displayExamdate);

            Regularization regularization = new Regularization();
            Thread thread3 = new Thread(regularization);

            System.out.println("Enter our choise ");
            int chosen = sc.nextInt();

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
                    flage = false;
                    break;
            }


        }
    }
}
