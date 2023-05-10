class OneDArray{
    public void displaydata(){

    }
}
class twoDArray{
    public void displaydata1(){

    }
}


public class ArrayDemo {
     static public void main(String... args){
            System.out.println("Hello");
            int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
            for(int i =0; i< arr.length;i++){
                for (int j =0; j<arr.length; i++){
                    System.out.println(arr[i][j]);
                }
            }
     }
}
