import java.util.StringTokenizer;

class TokenDemo{
    public void display(){
        StringTokenizer stringTokenizer = new StringTokenizer("Hi,how are you", "are", true);
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}


public class String_Tokenizer {
    public static void main(String[] args) {
        TokenDemo stringToken = new TokenDemo();
        stringToken.display();

    }
}
