package Day_15;

import java.util.HashMap;
import java.util.Map;

public class Majority_element {

    // Brute-forch
    public static int findMaxElement(int[] arr, int n){
        for (int i = 0; i < n; i++){
            int count = 0;
            for (int j = 0; j < n; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
                if (count > n/2)
                     return arr[i];
            }
        }
        return -1;
    }
    // Time complexity - O(n^2)
    // Space complexity - O(1)

    // Better
    public static int findMaxElem(int[] arr, int n){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > n/2)
                return entry.getKey();
        }
        return -1;
    }
    // Time complexity - O(n + n)  => O(n)
    // Space complexity - O(k)  k = number of unique elements, worst case n

    // Optimal
    public static int findMax(int[] arr, int n){
        int count = 0;
        int element = 0;
        for (int i = 0; i < n; i++){
            if (count == 0){
                element = arr[i];
                count++;
            }
            else if (arr[i] == element)
                count++;
            else
                count--;
        }
        return element;
    }
    // Time complexity - O(n)
    // Space complexity - O(1)

    public static void main(String[] args) {
        int[] arr = {2,2,3,3,1,2,2};
//        System.out.println(findMaxElement(arr, arr.length));
//        System.out.println(findMaxElem(arr, arr.length));
        System.out.println(findMax(arr, arr.length));
    }
}
