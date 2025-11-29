package Day_05;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    public static List<List<Integer>> frequency(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        // Count frequency
        for (int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        }
        // fetch
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1,3,2,1,3};
        int[] nums = {1,4,3,2,12};
//        countFrequency(arr,nums);
        System.out.println(frequency(arr));
    }
}
