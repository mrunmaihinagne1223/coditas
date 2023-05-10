package Complarator;
//compares


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int rno;
    String name , city;

    public String getCity() {
        return city;
    }

    public Student(int rno, String name, String city){
        this.rno=rno;
        this.name=name;
        this.city=city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

class SortByRoll implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {           //Abstract method compare so only one funtional interface
        return o1.rno-o2.rno;    //For interger - use minus
    }
}
class SortByCity implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}


public class Comparraterdemo {
    public static void main(String[] args) {

        ArrayList<Student>list = new ArrayList<Student>();
        list.add(new Student(4,"Mrunmai","Pune"));
        list.add(new Student(6,"Amai","Banlogru"));
        list.add(new Student(1,"yekti","mumbai"));
        list.add(new Student(2,"Pyisn","Nashik"));
        list.add(new Student(3,"Ravi","Hydrabad"));

        System.out.println("Before sorting by rollno");
        System.out.println();
        for (int i=0;i<list.size(); i++){
            System.out.println(list.get(i));

        }
        System.out.println("After sorting for rollno");
        Collections.sort(list,new SortByCity());
        for (int i=0;i<list.size(); i++){
            System.out.println(list.get(i));

        }
        System.out.println("before sorting by city");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("After sorting by city");
        Collections.sort(list,new SortByCity());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }



    }
}
