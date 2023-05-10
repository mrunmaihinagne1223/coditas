import java.util.StringTokenizer;

class TokenDemo1{
    public void display(){
        StringTokenizer stringTokenizer1 = new StringTokenizer("3+(20 %)", "+(%)" );
        while (stringTokenizer1.hasMoreTokens()){
            System.out.println(stringTokenizer1.nextToken());
        }
    }
}


public class Q8_SeparterToken {
    public static void main(String[] args) {
        TokenDemo1 stringToken1 = new TokenDemo1();
        stringToken1.display();
    }
}
