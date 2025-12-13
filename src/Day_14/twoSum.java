package Day_14;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static int[] findIndex(int[] nums, int target){
        int n = nums.length;
        for (int i = 0; i <= n -2; i++){
            for (int j = i + 1; j < n; j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    // Time complexity - O(n^2)
    // Space complexity - O(1)

    public static int[] findIndexOfTarget(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++){
            int nextElem = target - nums[i];
            if (map.containsKey(nextElem)){
                int index = map.get(nextElem);
                return new int[] {index, i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
    // Time complexity - O(n)
    // Space complexity - O(n)

    public static void main(String[] args) {
        int[] nums = {2,6,5,8,11};
        int target = 16;
//        int[] result = findIndex(nums, target);
        int[] result = findIndexOfTarget(nums, target);
        for (int i : result){
            System.out.print(i+" ");
        }
    }
}
