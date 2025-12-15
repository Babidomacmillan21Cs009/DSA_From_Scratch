package Day_16;

import java.util.ArrayList;
import java.util.List;

public class Rearrange_array_elements_by_sign {

    // Brute forch
    public static void reArrage(int[] nums, int n){
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int p = 0, ne = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                pos[p++] = nums[i];
            else
                neg[ne++] = nums[i];
        }

        for (int i = 0; i < n / 2; i++){
            nums[2 * i] = pos[i];
            nums[2 * i + 1] = neg[i];
        }
    }
    // Time complexity - O(2n)
    // Space complexity - O(n)

    // Optimal
    public static int[] reArrageArray(int[] arr, int n){
        int[] ans = new int[n];
        int pIndex = 0, nIndex = 1;
        for (int i = 0; i < n; i++){
            if (arr[i] > 0){
                ans[pIndex] = arr[i];
                pIndex += 2;
            }
            else{
                ans[nIndex] = arr[i];
                nIndex += 2;
            }
        }
        return ans;
    }
    // Time complexity - O(n)
    // Space complexity - O(n)


    // If the array doesn't have equal num of Pos and Neg we do like this
    public static void reArrangeArr(int[] nums, int n){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int posIndx = 0, negIndx = 1;
        for (int i = 0; i < n; i++){
            if (nums[i] > 0)
                pos.add(nums[i]);
            else
                neg.add(nums[i]);
        }
        int l = 0, r = 0;
        while (l < pos.size() && r < neg.size()){
            nums[posIndx] = pos.get(l);
            nums[negIndx] = neg.get(r);
            posIndx += 2;
            negIndx += 2;
            l++;
            r++;
        }
        int index = Math.min(pos.size(), neg.size()) * 2;
        while (l < pos.size()){
            nums[index++] = pos.get(l++);
        }
        while (r < neg.size()){
            nums[index++] = neg.get(r++);
        }
        // Time complexity - O(n)
        // Space complexity - O(n)
    }


    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
//        reArrage(nums, nums.length);
//        for (int i : nums){
//            System.out.print(i+" ");
//        }
        System.out.println(" if pos and neg are equal");
        int[] ans = reArrageArray(nums, nums.length);
        for (int i : ans){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        System.out.println(" if pos != neg");
        int[] arr = {1,2,4,-5,3,6};
        reArrangeArr(arr, arr.length);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
