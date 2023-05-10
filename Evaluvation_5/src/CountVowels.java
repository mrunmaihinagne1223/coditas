import java.util.Locale;

public class CountVowels {
    StringBuffer stringBuffer = new StringBuffer();
    String stringBuffernew ="";
    String newString ="";

         public void countVowels(String stringBuffer){

             int count =0;


           for (int i=0; i<stringBuffer.length();i++){
               if(stringBuffer.charAt(i)=='a' || stringBuffer.charAt(i)=='e' || stringBuffer.charAt(i)=='i'
               || stringBuffer.charAt(i)=='o'|| stringBuffer.charAt(i)=='u'
               ){
                 count++ ;


               }
               else {

                   stringBuffernew +=stringBuffer.charAt(i);
               }



           }
             System.out.println("No of vowels:: " +count);
             System.out.println("String without vowels::"+stringBuffernew);
    }
}
//"C:\Program Files\Java\jdk-19\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=59164:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Coditas\IdeaProjects\Evaluvation_5\out\production\Evaluvation_5 Q1NoofCharater
//        Numbers of token :: 3
//        No of vowels:: 3
//        String without vowels::uai
//
//        Process finished with exit code 0
