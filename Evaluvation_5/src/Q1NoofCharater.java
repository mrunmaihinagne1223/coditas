import java.util.Scanner;
import java.util.StringTokenizer;


public class Q1NoofCharater {
    public static void main(String[] args) {
//          TokenDemo tokenDemo = new TokenDemo();
//        System.out.println("Numbers of token :: " +tokenDemo.display());
//
//        CountVowels string = new CountVowels();
//        string.countVowels("Mrunmai");
//
//        NewString newString = new NewString();
//        newString.NextString("Mrunmai");

        Scanner sc = new Scanner(System.in);
        System.out.println("1:TokenCount, 2:CountVowels & remainingString , 3:NewString, 4:Nothing");
        System.out.println("Enter choice ?");
        boolean falg =true;
        while (falg){
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    TokenDemo tokenDemo = new TokenDemo();
                    System.out.println("Numbers of token :: " +tokenDemo.Tokendisplay("The river and the moon"));

                     break;
                case 2:
                    CountVowels string = new CountVowels();
                     string.countVowels("Mrunmai");
                     break;
                case 3:
                    NewString newString = new NewString();
                     newString.NextString("Mrunmai");
                     break;
                case 4:
                    falg = false;
            }
        }


    }
}
//"C:\Program Files\Java\jdk-19\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=59680:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Coditas\IdeaProjects\Evaluvation_5\out\production\Evaluvation_5 Q1NoofCharater
//        Numbers of token :: 3
//        No of vowels:: 3
//        String without vowels::uai
//        NewString without vowels:: nsuonai
//
//        Process finished with exit code 0
