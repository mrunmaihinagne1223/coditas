public class StringInjava {
    public static void main(String[] args) {
        String s = "Mrunmai";
        String s1 = "Mrunmai";
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        String sh = new String("Hello");
        String s3= new String("Hello 3");
        System.out.println(sh.hashCode());
        System.out.println(s3.hashCode());



    }
}
