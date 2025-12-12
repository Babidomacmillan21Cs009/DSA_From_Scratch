package Day_13;

import java.util.HashMap;
import java.util.Map;

public class Longest_subarray_with_sum_K {

    // Brute-forch
    public static int findLongestLength(int[] arr, int k){
        int n = arr.length;
        int length = 0;
        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = i; j < n; j++){
                sum += arr[j];
                if (sum == k)
                    length = Math.max(length, j - i + 1);
            }
        }
        return length;
    }
    // Time complexity - O(n^2)
    // Space complexity - O(1)


    public static int longestSubarrayWithSumK(int[] arr, int k){
        Map<Long, Integer> pre = new HashMap<>();
        long sum = 0;
        int maxLen = 0, n = arr.length;
        for (int i = 0; i < n; i++){
            sum += arr[i];

            if (sum == k)                  // if prefix sum itself equals k
                maxLen = Math.max(maxLen, i + 1);

            long rem = sum - k;
            if (pre.containsKey(rem)){
                int len = i - pre.get(rem);         // if found get the length
                maxLen = Math.max(maxLen, len);
            }
            // store first occurrence of this prefix sum only
            pre.putIfAbsent(sum, i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int k = 3;
//        System.out.println(findLongestLength(arr, k));
        System.out.println(longestSubarrayWithSumK(arr, k));
    }
}
