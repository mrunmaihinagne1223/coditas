import java.util.Map;


import java.util.Hashtable;
import java.util.Map;

public class Que1 {

    public static void main(String[] args){
        Map<String,Integer> marks = new Hashtable<>();
        marks.put("Mrunmai",90);
        marks.put("Harsh",88);
        //marks.put("Tanmay",98);
        marks.put("Shreya",100);
        //marks.put("Shreya",60);
        //If same key then replaces the first one.

        System.out.println("mrunmi marks"+marks.get("Mrunmai"));
        System.out.println("Shreyas marks"+marks.get("Shreya"));

        System.out.println(marks);
        marks.putIfAbsent("Tanmay",300);
        System.out.println(marks);

        System.out.println("Number of keyValuespaire"+marks.size());





    }
}