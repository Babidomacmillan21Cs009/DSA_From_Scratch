package Day_05;

import java.util.HashMap;
import java.util.Map;

public class NumberHashing {

    // Using Array Hashing
    public static void countFrequency(int[] arr, int[] nums){
        // we mentioned size as 13 to access 12th num in index  0 --> 12
        int[] hash = new int[13];
        // precompute
        for (int i = 0; i < arr.length; i++){
            hash[arr[i]]++;
        }
        // Fetch
        for (int num : nums){
            System.out.println(hash[num]);
        }

    }

    // Using HashMap Data Structure
    public static void frequency(int[] arr, int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        // Count frequency
        for (int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        }
        // fetch
        for (int num : nums){
            System.out.println(map.getOrDefault(num, 0));
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,3,2,1,3};
        int[] nums = {1,4,3,2,12};
//        countFrequency(arr,nums);
        frequency(arr,nums);
    }
}
