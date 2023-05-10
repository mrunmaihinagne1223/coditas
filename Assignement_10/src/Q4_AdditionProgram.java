class Addition{
    public int add(int i, int i1, int i2, int i3, int i4){
      return 0;
    }

    public int add(int a, int b){
        return a*b;
    }
    public int add(int a, double b){

        return (int) (a*b);
    }
    public int add(int a){

        return a;
    }

}
class VarargeAddition {

    public  int add(int ...args) {
        int result = 0;
        for (int a: args){
            result+=a;
        }
        return result;
    }



}

public class Q4_AdditionProgram {

    public static void main(String[] args) {
//        Addition addition = new Addition();
//        addition.add(1,3);
//        addition.add(1,7.6);

       VarargeAddition addition1= new VarargeAddition();
        System.out.println(addition1.add(1,2,3));



    }
}
