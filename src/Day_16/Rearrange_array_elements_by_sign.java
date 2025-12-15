package Day_16;

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



    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
//        reArrage(nums, nums.length);
//        for (int i : nums){
//            System.out.print(i+" ");
//        }
        int[] ans = reArrageArray(nums, nums.length);
        for (int i : ans){
            System.out.print(i+" ");
        }
    }
}
