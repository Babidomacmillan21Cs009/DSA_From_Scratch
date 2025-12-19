package Day_19;

import java.util.ArrayList;
import java.util.List;

public class Duplicates_zeros {


    public static void dupZeros(int[] arr, int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            if (arr[i] == 0)
                list.add(arr[i]);
            list.add(arr[i]);
        }

        for (int i = 0; i < n; i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    // Time complexity - O(n)
    // Space Complexity - O(n)

    public static void duplicateZeros(int[] arr, int n){
        int zeroCount = 0;
        for(int i : arr){
            if(i == 0)
                zeroCount++;
        }                                               // index  0 1 2 3 4 5 6 7 8 9 10
        int j = n + zeroCount - 1;  // Imagine a duplicate array  1 0 2 3 0 4 5 0 0 0 0
        for(int i = n - 1; i >= 0; i--){        //                              i     j
            if(arr[i] != 0){
                if (j < n)
                    arr[j] = arr[i];
                j--;
            }
            else{
                if (j < n)
                    arr[j] = 0;
                j--;
                if (j < n)
                    arr[j] = 0;
                j--;
            }
        }
    }
    // Time complexity - O(n)
    // Space complexity - O(1)

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
//        dupZeros(arr, arr.length);
        duplicateZeros(arr, arr.length);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
