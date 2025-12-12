package Day_13;

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
    // Time complexity - O(n^3)
    // Space complexity - O(1)

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int k = 3;
        System.out.println(findLongestLength(arr, k));
    }
}
