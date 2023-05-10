// * dataType then wrapper class


public class WrapperClass {
    public static void main(String[] args) {
             int a=50; int b;

        Integer a1 = a;              //autoBoxing -->

        b= (int) a1;                    // unboxing
        System.out.println(b);
        System.out.println(a1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a1.hashCode());
        System.out.println(a);
        String s = "Mrunmai";


    }
}
