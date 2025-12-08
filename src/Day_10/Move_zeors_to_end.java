package Day_10;

import java.util.Scanner;

public class Move_zeors_to_end {

    public static void move(int[] arr, int n){      // TC --> O(2n) => O(n)  SC -> O(n)
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }

        int k = 0;
        for (int i = 0; i < temp.length; i++){
            arr[k] = temp[i];
            k++;
        }
    }

    public static void moveZeors(int[] arr, int n){     // TC -> O(n)  sc -> O(1)
        int j = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0)
                j++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        move(arr, arr.length);
//        moveZeors(arr, arr.length);
        for (int i : arr){
            System.out.print(i+" ");
        }

    }
}
