package Day_17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_consecutive_sequence {

    // Brute forch
    public static int longestConsecutiveSequence(int[] arr, int n){
        int longest = 1;
        for (int i = 0; i < n; i++){
            int count = 1;
            int x = arr[i];
            while (ls(arr, x + 1) == true){
                x++;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static boolean ls(int[] arr, int num){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num)
                return true;
        }
        return false;
    }
    // Time complexity - O(n^3) worst case
    // Space complexity - O(1)

    public static int findLongest(int[] arr, int n){
        Arrays.sort(arr);
        int longest = 1;
        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] - 1 == lastSmaller) {
                lastSmaller = arr[i];
                count++;
            }
            else if (arr[i] != lastSmaller) {
                count = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
    // Time complexity - O(n) + O(N log n)
    // Space complexity - O(1)

    // Optimal
    public static int findLongestSequence(int[] arr, int n){
        Set<Integer> set = new HashSet<>();
        if (n == 0) return 0;
        int longest = 1;

        for (int num : arr){
            set.add(num);
        }
        System.out.println(set);

        for (int num : set){
            if (!set.contains(num - 1)){     // // start only if num is the beginning
                int current = num;
                int count = 1;
                while (set.contains(current + 1)){         // if next elem is there just count it
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }

        return  longest;
    }

    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
//        System.out.println(longestConsecutiveSequence(arr, arr.length));
//        System.out.println(findLongest(arr, arr.length));
        System.out.println(findLongestSequence(arr, arr.length));
    }
}
