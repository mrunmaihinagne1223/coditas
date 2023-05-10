import java.lang.reflect.Field;

class Students{
    //variables**************************************************************************************************
    private int id;
    public String name;
    //Constructor************************************************************************************************
    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private Students(int id) {
        this.id = id;
    }
    //methods*****************************************************************************************************
    public void show(){
        System.out.println("NAME : "+name);
    }
    private void show( String  a){
        System.out.println("NAME WITH SURNAME : "+name+a);

    }
}

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException,ClassCastException {
        Students students = new Students(1,"Mrunmai");
        Class obj = students.getClass();

        System.out.println("**************************VARIABLE*************************************");








    }
}
