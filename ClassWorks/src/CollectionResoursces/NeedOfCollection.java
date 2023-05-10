package CollectionResoursces;

import java.util.*;

public class NeedOfCollection {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2,"A");
        map.put(4,"C");
        map.put(6,"E");
        map.put(8,"G");



        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1,"B");
        map1.put(3,"F");
        map1.put(5,"H");
        map1.put(7,"I");

        map.putAll(map1);

        for (Map.Entry<Integer,String>entry : map.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

        System.out.println("Size:"+ map.size());



    }

}