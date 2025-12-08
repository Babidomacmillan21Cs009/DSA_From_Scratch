package Day_10;

import java.util.Scanner;

public class Linear_Search {

    public static int linearSearch(int[] arr, int num, int n){
        for (int i = 0; i < n; i++){
            if (arr[i] == num)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter num to find index :");
        int num = sc.nextInt();
        System.out.println(linearSearch(arr, num, arr.length));
    }
}
