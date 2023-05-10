package Resoures_ForExpection_Handel;

public class Only_Exception {
    public static void main(String[] args) {
        int a=12;
        int b=0;
        int result =a/b;
        System.out.println(result);
        throw new ArithmeticException();
    }
}
