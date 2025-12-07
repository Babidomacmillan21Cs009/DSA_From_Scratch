package Day_09;

import java.util.Scanner;

public class Left_rotate_an_array_by_one_place {

    public static void leftRotate(int[] arr, int n){
        int temp = arr[0];
        for (int i = 1; i < n; i++){
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        leftRotate(arr, arr.length);
        for (int i : arr){
            System.out.print(i +" ");
        }
    }
}
