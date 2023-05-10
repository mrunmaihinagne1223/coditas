class ABC{
    public static void main(String[] args) {
        int []array = new int[10];
        int sum = 0;

       try {
           for (int i=0;i<array.length+1;i++){
               sum = sum + array[i];
           }
       }
       catch (ArrayIndexOutOfBoundsException a){
           System.out.println("ArrayIndexOutOfBoundsException handling");
       }
        for (int i=0;i<array.length-1;i++){
            sum = sum + array[i];
        }


    }
}


public class Q5_ClassCastException {
    public static void main(String[] args) {

    }
}
