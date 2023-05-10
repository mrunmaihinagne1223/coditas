import java.util.*;

class Student  {
    int rollno, age;

    String name;
    String divison;
    String address;
    int marks[] = new int[5];


   //Construtor 1 ->Add student Info
    Student(int rollno, int age, String name, String division, String address,int arr[]){
        this.rollno=rollno;
        this.age=age;
        this.name=name;
        this.divison=division;
        this.address=address;
        this.marks=arr;

    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", divison='" + divison + '\'' +
                ", address='" + address + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }


    public String NewtoString() {
        return "Student{" +
                "marks=" + Arrays.toString(marks) +
                '}';
    }

    public void NtoString() {
        System.out.println("student marks are");
        for (int i : marks){
            System.out.print(i+" ");
        }
        System.out.println();
    }


}
// Method to AddStudent
public class AddStudent   implements Runnable {

    Scanner sc = new Scanner(System.in);

    static List<Student> listOfStudents = new ArrayList<>();





    public void run() {

        System.out.println("enter roll no");
        int rollno = sc.nextInt();
        Boolean FlageForRollno=false;
        for (Student s : listOfStudents){
            if(s.rollno==rollno){
                FlageForRollno=true;
                break;
            }


        }
        if(FlageForRollno){
            try {
                throw new DuplicateStudentException();
            } catch (DuplicateStudentException e) {
                System.out.println("");
            }
          return;
        }




        System.out.println("enter age ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("enter name");
        String name = sc.nextLine();



        System.out.println("enter div");
        String divison = sc.next();

        sc.nextLine();
        System.out.println("Enter address");
        String add = sc.nextLine();


        int[] array = new int[5];
        int[]marks = array;
        System.out.println("Enter marks of student: ");
        Boolean FlageForException = true;
        int grace =1;
        for (int i = 0; i < 5; i++) {

            array[i] = sc.nextInt();
            if(array[i]<35 && grace==1){
                grace--;
                array[i]+=5;

            }

            if(array[i]>100 || array[i]<0){
                FlageForException =false;

                try {
                    throw new MarksNoInRange();
                } catch (MarksNoInRange e) {
                    System.out.println();
                }

                System.out.println("Enter 0 to exit and again Add valid markses");
                break;

            }

        }

       if(FlageForException ) {
           Student s1 = new Student(rollno, age, name, divison, add, marks);
           listOfStudents.add(s1);
           System.out.println(s1);


           }


       }







   // Display Methods
    public void diplaystudents() {
        Collections.sort(listOfStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Student m : listOfStudents){
            System.out.println(m);
        }


    }
    public void displaymarksheet(){
        System.out.println("Enter Roll No how marksheet is to display");
        int inputrollno = sc.nextInt();
        for (Student d : listOfStudents){
            if(d.rollno==inputrollno){
                System.out.println(d.NewtoString());

            }
        }

    }

}

