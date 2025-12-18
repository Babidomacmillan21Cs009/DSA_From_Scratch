package Day_18;

import java.util.HashMap;
import java.util.Map;

public class Subarray_Sum_Equals_K {

    public static int subArray(int[] nums, int k){
        int n = nums.length;
        int totalSubArray = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k){
                    totalSubArray++;
                }
            }
        }
        return totalSubArray;
    }
    // Time complexity - O(n^2)
    // Space complexity - O(1)

    // it works only for positive numbers
    public static int sunArr(int[] nums, int k){
        int n = nums.length;
        int l = 0, r = 0;
        int totalSubArray = 0;
        int sum = 0;
        while(l < n && r < n){
            sum += nums[r];
            while (sum > k){
                sum -= nums[l];
                l++;
            }
            if (sum == k){
                totalSubArray++;
            }
            r++;
        }
        return totalSubArray;
    }
    // Time complexity - O(n)
    // Space complexity - O(1)

    // Optimal
    public static int subArrWithSumK(int[] nums, int k){
        Map<Integer, Integer> preSum = new HashMap<>();
        int count = 0;
        int sum = 0;
        preSum.put(sum,1);
        for (int num : nums){
            sum += num;
            if (preSum.containsKey(sum - k))
                count += preSum.get(sum - k);
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    // Time complexity - O(n)
    // Space complexity - O(n)

    public static void main(String[] args) {
        int[] nums = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;
//        System.out.println(subArray(nums, k));
//        System.out.println(sunArr(nums, k));
        System.out.println(subArrWithSumK(nums, k));
    }
}
