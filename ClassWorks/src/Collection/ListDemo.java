package Collection;

import java.util.ArrayList;
import java.util.List;


public class ListDemo {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(8);

        System.out.println("**************method*************");
        System.out.println(""+list.get(1));
        System.out.println("indexof 8 ="+list.indexOf(8));
        System.out.println("lastindexOf 8  ="+list.lastIndexOf(8));

        for (Integer i:list){
            System.out.println(i);
        }

    }
}
