package Day_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contains_duplicate_II {

    // Brute forch
    public static boolean containsNearbyDuplicate(int[] nums, int k){
        int n = nums.length;
        for (int i = 0; i <= n -2; i++){
            int j = i + 1;
            while (j < n && nums[i] != nums[j]){
                j++;
            }
            if (j < n && nums[i] == nums[j]){
                if(j - i <= k)
                    return true;
            }
        }
        return false;
    }
    // Time complexity - O(n^2)
    // Space complexity - O(1)

    // Optimal
    public static boolean containsNearDuplicate(int[] nums, int k){
        int n = nums.length;
        Map<Integer ,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            if (map.containsKey(nums[i])){           // Check the num already appear the get index
                int preIdx = map.get(nums[i]);         // get last seen index
                int curIdx = i;                         // get new index
                int len = curIdx - preIdx;
                if (len <= k)
                    return true;
            }
            map.put(nums[i], i);            // store elem with new index
        }
        return false;
    }
    // Time complexity - O(n)
    // Space complexity - O(n)


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

//        System.out.println(containsNearbyDuplicate(nums, k));
        System.out.println(containsNearDuplicate(nums, k));
    }
}
