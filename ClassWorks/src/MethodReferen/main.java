package MethodReferen;

import java.util.List;
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Mrunmai","Aarti","Dhriti","Smir");
        list.forEach(yash -> System.out.println(yash));
        System.out.println("**************************");
        list.forEach(System.out::println);

    }

}
