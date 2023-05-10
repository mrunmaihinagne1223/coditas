package Collection;

import java.util.*;

public class collection{
    public static void main(String[] args) {
        Set<Integer>set = new Set<Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        Set<Integer> set1 = new HashSet<>();  //Upcasting
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);
        set1.add(9);

        Set<Integer> set2 = new HashSet<>();  //Upcasting
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(8);
        set2.add(10);

        set1.addAll(set2);
        System.out.println("contains "+set1.contains(10));
        System.out.println("elements"+set1.retainAll(set2));



        //Way 1
        for (Integer i : set1){
            System.out.println(i);
        }

        //Way2  --> forward direction
        Iterator<Integer> integerIterator = set1.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }




    }
}
