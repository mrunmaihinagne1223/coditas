import java.util.*;

public class ConTreetoHashset {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(27);
        Set<Integer> tree = new TreeSet<>(hs);
        Iterator<Integer> iterator = tree.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set<Integer> t = new TreeSet<>();
        t.add(29);
        Set<Integer> hss = new HashSet<>(t);
        Iterator<Integer> i = hss.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

        Set<Integer> hss1 = new HashSet<>(t);
        hss1.add(98);
        int[] array = hss1.stream().mapToInt(Integer::intValue).toArray();
        for (int j=0;j<array.length;j++){
            System.out.println(array[j]);
        }



    }
}
