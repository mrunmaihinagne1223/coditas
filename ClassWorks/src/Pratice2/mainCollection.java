package Pratice2;

import java.util.*;

public class mainCollection  {
    public static void main(String[] args) {
        String str = "I love my India. my India";
        String str1[] = str.split("[ .]");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str1.length; i++) {
            if (hashMap.containsKey(str1[i])) {
                hashMap.put(str1[i], hashMap.get(str1[i]) + 1);
            } else {
                hashMap.put(str1[i], 1);
            }
        }
        System.out.println(hashMap.get(str1[2]));
        System.out.println(hashMap);
        
        int arr[]={2,7,11,15};
        int arr1[];
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for (int i =0;i<arr.length;i++){
            map1.put(i,arr[i]);
        }
        for (int i =0;i<arr.length;i++){
           // int firstnum + int seconnum = int target;
            int secondnum = 9-arr[i];
            if(map1.containsKey(secondnum)){
                System.out.println("Ouptut"+i+" "+" "+map1.get(secondnum));

            }
        }

        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add("Stringsh");
        arrayList.add(true);
        System.out.println(arrayList.size());
        System.out.println("Before add"+arrayList);


        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(45);
        arrayList2.add("resgs");
        arrayList2.add("usys");

        System.out.println("SEond araylist "+arrayList2);

        arrayList.addAll(arrayList2);

        System.out.println("After addall"+arrayList);

        System.out.println("************************LIST********************");
        List l1 = new ArrayList();
        l1.add(98);
        l1.add(null);
        l1.add(88);

       Iterator it = l1.iterator();
       while (it.hasNext()){
           System.out.println(it.next());
       }


        Set set = new HashSet();
        set.add(77);
        set.add(null);
        set.add(null);
        System.out.println("************SET**************");
        it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("*********CUROUSD***********");
        List l2 = new ArrayList();
        l2.add(76);
        l2.add(null);
        l2.add(13);
        l2.add("sjshjs");

        ListIterator lit = l2.listIterator();
        System.out.println("********LIST FOWORD ****");
        while (lit.hasNext()){
            System.out.println(lit.next());
        }
        System.out.println("******LIST BACKWARD*********");
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }
        System.out.println("*************VECTORS & ENUMNUTERATION *************");
        Vector vector = new Vector();
        vector.add(88);
        vector.add(98);
        vector.add("uh");
        Enumeration er = vector.elements();
        while (er.hasMoreElements()){
            System.out.println(er.nextElement());
        }
        System.out.println("****************ARRAY LIST******************");
        ArrayList ar = new ArrayList();
        ar.add(55);
        ar.add(87);
        ar.add("iia");
        ar.add("88");
        System.out.println(ar);
        System.out.println("Index at 1 : "+ar.get(1));
        System.out.println(ar.set(2,98));
        System.out.println(ar);
        System.out.println("*************Linklist************");
        LinkedList linkedList = new LinkedList();
        linkedList.add("koran");
        linkedList.add("ooo");
        linkedList.add("pau");
        linkedList.add(78);
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
//        linkedList.removeFirst();
//        linkedList.removeLast();
        System.out.println(linkedList);








    }
}

