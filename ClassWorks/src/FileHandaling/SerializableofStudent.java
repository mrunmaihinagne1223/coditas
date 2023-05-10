package FileHandaling;

import java.io.*;

public class SerializableofStudent {
    public static void main(String[] args) {




    {
        try {
            Student s1 = new Student("mrunmai", "pune", 1);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.txt"));
            objectOutputStream.writeObject(s1);
            System.out.println("done Serialization  of Student");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
}
/* OutputWithout Transit Keyword
�� sr FileHandaling.Student����� I idL cityt Ljava/lang/String;L
nameq ~ xp   t punet mrunmai*/

/*OutputWith Transit Keyword ==> id absent
�� sr FileHandaling.Student��v��� L cityt Ljava/lang/String;L
nameq ~ xpt punet mrunmai
 */