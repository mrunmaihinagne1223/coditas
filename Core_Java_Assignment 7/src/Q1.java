import java.util.Arrays;
import java.util.Collection;
import java.util.Arrays;
import java.util.Collection;
import java.util.*;

public class Q1 {

    public static void main(String[] args) {

        Integer array[] = { 1, 2, 3, 4, 5 };

        Arrays.sort(array);
        System.out.println("Sort array in ascending order");
        System.out.print(Arrays.toString(array));
        System.out.println();
        // Sorting the array in descending order
        System.out.println("Sort array in descending  order");
        Arrays.sort(array, Collections.reverseOrder());



        // Printing the elements
        System.out.println(Arrays.toString(array));
    }
}
