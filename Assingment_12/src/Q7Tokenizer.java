import java.util.StringTokenizer;

class TokenDemo{
    public void display(){
        StringTokenizer stringTokenizer = new StringTokenizer("Hi,all.How are you?", ","+","+"."+"?", true );
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}

class Q7Tokenizer {
    public static void main(String[] args) {
        TokenDemo stringToken = new TokenDemo();
        stringToken.display();
    }
}
