package Day_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leaders_in_an_array {

    public static List<Integer> findLeaders(int[] arr, int n){
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++){
            boolean leader = true;              // Assume i is larger
            for (int j = i + 1; j < n; j++){
                if (arr[i] < arr[j]){       // if any larger elem find on it's right i is not larger so make false
                    leader = false;
                    break;
                }
            }
            if (leader)                 // if still i is larger then add
                ans.add(arr[i]);
        }
        return ans;
    }
    // Time complexity - O(n^2) near about
    // Space complexity - O(n) to store the ans

    public static List<Integer> findLeadersInArray(int[] arr, int n){
        List<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;  // max will keep track of max elem on right
        for (int i = n - 1; i >= 0; i--){
            if (arr[i] > max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    // Time complexity - O(n)
    // Space complexity - O(n) to store ans

    public static void main(String[] args){
        int[] arr = {10,22,12,3,0,6};
//        List<Integer> ans = findLeaders(arr, arr.length);
        List<Integer> ans = findLeadersInArray(arr, arr.length);
        System.out.println(ans);
    }
}
