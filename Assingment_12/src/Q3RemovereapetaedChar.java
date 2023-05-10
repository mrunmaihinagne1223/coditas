import java.util.Scanner;
import java.util.Arrays;


class Q3RemovereapetedChar {

    static void removeDuplicate(char[] strings, int len){
        int index =0;
        for(int i=0;i<len;i++){
            int j;
            for ( j = 0; j < i; j++)
            {
                if (strings[i] == strings[j])
                {
                    break;
                }
            }
            if (j == i)
            {
                strings[index++] = strings[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(strings, index)));

    }


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] strings = str.toCharArray();
        int len = strings.length;
        removeDuplicate(strings,len);


    }
}
