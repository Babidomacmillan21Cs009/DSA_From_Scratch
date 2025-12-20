package Day_20;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class Majority_Element_II {

    public static List<Integer> majorityElement(int[] arr, int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int count = 1;
            for (int j = i + 1; j < n; j++){
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > n / 3)
                list.add(arr[i]);
        }
        return list;
    }
    // Time complexity - O(n^2)
    // Space complexity - O(1)

    public static List<Integer> majElem(int [] arr, int n){
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) == (n / 3) + 1)  // add only once when count meets
                list.add(arr[i]);
            if (list.size() == 2) break;
        }
        return list;
    }
    // Time complexity - O(n)
    // Space complexity - O(n)

    public static List<Integer> majorityElements(int[] arr, int n){     // 1,1,1,3,3,2,2,2 at max 2 elements only appear in n / 3
        List<Integer> list = new ArrayList<>();
        int count1 = 0, count2 = 0;
        int can1 = 0, can2 = 0;
        for (int i = 0; i < n; i++){
            if (count1 == 0 && arr[i] != can2){         // Ensure two elements are unique
                can1 = arr[i];
                count1++;
            } else if (count2 == 0 && arr[i] != can1){
                can2 = arr[i];
                count2++;
            } else if (can1 == arr[i])
                count1++;
            else if (can2 == arr[i])
                count2++;
            else {
                count1--;
                count2--;
            }
        }
        // check the nums are appear more than n / 3 times
        count1 = 0;    // it indicates can1
        count2 = 0;   // it indicates can 2
        for (int num : arr){
            if (num == can1) count1++;
            else if (num == can2) count2++;
        }
        if (count1 > n / 3) list.add(can1);
        if (count2 > n / 3) list.add(can2);
        return list;
    }
    // Time complexity - O(n);
    // Space complexity - O(1);


    public static void main(String[] args) {
        int[] arr = {3,2,3};
//        System.out.println(majorityElement(arr, arr.length));
//        System.out.println(majElem(arr, arr.length));  // HashMap
        System.out.println(majorityElements(arr, arr.length));
    }
}
