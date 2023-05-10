public class ObjectDemo {
    int nameid;
    String add;

    @Override
    public String toString() {
        return "{ " +
                "nameid=" + nameid +
                ", add='" + add + '\'' +
                " }";
    }

    public static void main(String[] args) {
        Object object = new Object();
        ObjectDemo object1 = new ObjectDemo();
        object1.nameid=1;
        object1.add="pune";
        System.out.println("object 1 : "+object1.toString());



        /* The hash code is a unique identifier for the object, which is based on its memory address in the JVM.*/
        System.out.println("Hashcode of object : "+object.hashCode());
        System.out.println("Hashcode of object1 : "+ object1.hashCode());
        String a="Mrunmai";
        String b="Mrunmai";
        String stringObj = new String("Mrunmai");
        if(a.equals(stringObj) && b.equals(stringObj) ){
            System.out.println("True a=b=c ");
            System.out.println("Hashcode a: "+a.hashCode());
            System.out.println("Hashcode b: "+b.hashCode());
            System.out.println("HashCode obj: "+ stringObj.hashCode());

        }

    }


}
