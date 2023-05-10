import java.util.Arrays;
public class Q3 {
    public static void main(String[] args) {

        int Array1[] = {20,30,40,50,60};
        System.out.println(Arrays.toString(Array1));

        System.out.println("Copied array");
        System.out.println("New Array "+Arrays.toString(Arrays.copyOf(Array1,5)));

    }


}
