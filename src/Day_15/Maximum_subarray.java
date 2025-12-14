package Day_15;
//
//            Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//            Output: 6
//            Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//
//            Input: nums = [1]
//            Output: 1
//            Explanation: The subarray [1] has the largest sum 1.
//
//            Input: nums = [5,4,-1,7,8]
//            Output: 23
//            Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

public class Maximum_subarray {

    // Brute forch
    public static int maxSubArray(int[] nums, int n){
        int maxSum = nums[0];
        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = i; j < n; j++){
                sum += nums[j];
                if (sum > maxSum)
                    maxSum = sum;
            }
        }
        return maxSum;
    }
    // Time complexity - O(n^2)
    // Space complexity - O(1)

    // Optimal  ---> Kadane's Algorithm
    public static int subArray(int[] nums, int n){
        int maxSum = nums[0];
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += nums[i];
            if (sum > maxSum)
                maxSum = sum;
            if (sum < 0){         // if we carry negative elements it will always gives minimum value [-2,-3] = -2 is greater than -5
                sum = 0;           // so make sum as 0
            }
        }
        return maxSum;
    }
    // Time complexity - O(n)
    // Space complexity - O1)

    // It will print the subArray of max sum
    public static void MaxSumSubarray(int[] nums, int n){
        int maxSum = nums[0];
        int sum = 0,start = 0;
        int ansStart = 0, ansEnd = 0;
        for (int i = 0; i < n; i++){
            if (sum == 0)
                start = i;
            sum += nums[i];
            if (maxSum < sum){
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0)
                sum = 0;
        }
        for (int i = ansStart; i <= ansEnd; i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {-2,-3,4,-1,-2,1,5,-3};
//        System.out.println(maxSubArray(nums, nums.length));
        System.out.println(subArray(nums, nums.length));
        MaxSumSubarray(nums, nums.length);
    }
}
