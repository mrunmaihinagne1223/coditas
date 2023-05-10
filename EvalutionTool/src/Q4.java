class Demo{
    static int b;
    int a;
    public void diaplay(){
        int cb=4;
    System.out.println(b);
        System.out.println(a);
        System.out.println(cb);
    }
    public static void display2(){
        int c=9;
        //System.out.println(a);
        System.out.println(c);
        System.out.println(b);
    }
}

public class Q4 {
    static int a;
    public static void main(String args[]){

         int arr[] = {2, 4, 5, 6, 7, 8};
         int sum = 0;

         int multi = 1;
         for (int i=0; i<arr.length; i++){
             if(i % 2==0){
                 sum = sum + arr[i];
             }
             else{
                   multi= multi * arr[i];
             }
         }

         System.out.println("SUM of Multiple " + sum);
        System.out.println("SUM of Multiple"  + multi);
        System.out.println(Demo.b); //  accessing by using class name
        Demo d=new Demo();
        System.out.println(d.b);// accessing by using object reference
        Demo.display2();

    }
}
