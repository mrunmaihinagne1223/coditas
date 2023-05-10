import java.util.Arrays;
public class Q5 {

    public static void main(String args[]){
        int arr1 [][] = {{1,2,3},{2,3},{1}};
        int arr2 [][] = {{5,7,8},{3,4},{7,5}};
        int result = 0;
        for(int i = 0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                result = arr1[i][j] + arr2[i][j];
                System.out.println("Addition of Array[" + i + "][" + j + "] is :: " + result);
            }
        }
}
}
