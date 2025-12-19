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
        for (int num : arr){
            map.put(num, map.getOrDefault(num, 0)+ 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > n / 3)
                list.add(entry.getKey());
        }
        return list;
    }
    // Time complexity - O(n)
    // Space complexity - O(n)

    public static List<Integer> majElement(int [] arr, int n){
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int count = 1;
        for (int i = 1; i < n; i++){
            if (arr[i] == arr[i - 1])
                count++;
            if (count > n / 3)
                list.add(arr[i]);
            else
                count = 1;
        }
        return list;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,1,1,2,2};
        System.out.println(majorityElement(arr, arr.length));
        System.out.println(majElem(arr, arr.length));
        System.out.println(majElement(arr, arr.length));
    }
}
