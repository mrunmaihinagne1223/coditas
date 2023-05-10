package RevisionEvaluvation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcom To Our Resturunt ");
            System.out.println("Enter  1: BookTable");
            System.out.println("Do you want to book table enter name and seat");
            String name = sc.nextLine();

            int seats = sc.nextInt();

            int chosen = sc.nextInt();
            switch (chosen) {
                case 1:
                    MenuTable bookTable = new MenuTable();
                    bookTable.booking(name, seats);
                    bookTable.displaymenu();

                    bookTable.placdOrder();
                    break;

            }


        }
    }
}
/*    (Atlest one coffe to order)
"C:\Program Files\Java\jdk-19\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=53741:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Coditas\IdeaProjects\Assignment_Multiplethreading\out\production\Assignment_Multiplethreading RevisionEvaluvation.main
Welcom To Our Resturunt
Do you want to book table enter name and seat
Mrunmai
6
yout table for 6 is booked
1:Coffe:100/-
2:pizza:200/-
3:tea:300/-
What is your Table No
1
Enter serial no of menu
2
Enter quantity no of menu
2
Continue order press 1 OR Exit enter 0
0
please order atlest one coffe

Process finished with exit code 0

*/
/*   With coffe you can order and bill will total bill showed
"C:\Program Files\Java\jdk-19\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=53794:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Coditas\IdeaProjects\Assignment_Multiplethreading\out\production\Assignment_Multiplethreading RevisionEvaluvation.main
Welcom To Our Resturunt
Do you want to book table enter name and seat
Mrunmai
6
yout table for 6 is booked
1:Coffe:100/-
2:pizza:200/-
3:tea:300/-
What is your Table No
1
Enter serial no of menu
1
Enter quantity no of menu
2
Continue order press 1 OR Exit enter 0
0
Thank you for order
Your Total bill is 200

Process finished with exit code 0

*/
