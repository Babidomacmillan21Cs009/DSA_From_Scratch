package Day_08;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {

    public static List<Integer> secondMax(int[] arr, int n){
        int firstMax = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if (arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if (arr[i] > secondMax && firstMax != arr[i])
                secondMax = arr[i];
        }
        return Arrays.asList(firstMax, secondMax);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,5,7,6};
        System.out.println(secondMax(arr,arr.length));
    }
}
