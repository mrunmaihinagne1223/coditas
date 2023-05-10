import java.util.Scanner;

public class Q6 {
    public static void main(String args[]){
        int arr[] = {1, 3, 6, 8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth index");
        int key = sc.nextInt();
        if(key <= arr.length){
            int element = arr[key-1];
            System.out.println("Element at nth index "+element);
        }
        else {
            System.out.println("Position not print");
        }


    }
}
