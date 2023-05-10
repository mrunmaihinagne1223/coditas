import java.util.StringTokenizer;

public class TokenDemo {

        public int Tokendisplay(String s ){
            StringTokenizer stringTokenizer = new StringTokenizer(s);
            int result =0;
            while (stringTokenizer.hasMoreTokens()){
                stringTokenizer.nextToken();
                result++;
            }
            return result;
        }
    }

