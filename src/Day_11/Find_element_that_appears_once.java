package Day_11;

import java.util.HashMap;
import java.util.Map;

public class Find_element_that_appears_once {

    // Brute-forch
    public static int findElement(int[] arr, int n){
        int elem = 0;
        for (int i = 0; i < n; i++){
            int count = 0;
            for (int j = 0; j < n; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count == 1)
                elem = arr[i];
        }
        return elem;
    }
    // Time complexity - O(n^2)
    // Space complexity - O(1)

    // Better
    public static int findingExactOneNumber(int[] arr, int n){
        Map<Integer, Integer> map = new HashMap<>();
        // Inserting into map
        for (int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        // Fetching
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return -1;
    }
    // Time complexity - O(n + (n/2)+1) => O(n + k)
    // Space complexity - O(k/1 + 1) => O(k)


    // Better
    public static int findElem(int[] arr, int n){
        int max = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        int[] hash = new int[max + 1];
        for (int i = 0; i < n;i++) {
            hash[arr[i]]++;
        }
        for (int i = 0; i < hash.length; i++){
            if (hash[i] == 1)
                return i;
        }
        return -1;
    }
    // Time complexity - O(n)
    // Space complexity - O(max(n))

    // Optimal
    public static int findingtheNumber(int[] arr, int n){
        int xor = 0;
        for (int i =0;  i < n; i++){
            xor ^= arr[i];              // a ^ a = 0.  0 ^ a = a
        }
        return xor;
    }
    // Time complexity - O(n)
    // Space complexity - O(1)

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
//        System.out.println(findElement(arr, arr.length));
//        System.out.println(findingExactOneNumber(arr, arr.length));
//        System.out.println(findElem(arr, arr.length));
        System.out.println(findingtheNumber(arr, arr.length));
    }
}
