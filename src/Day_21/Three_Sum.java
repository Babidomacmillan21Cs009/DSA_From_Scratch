package Day_21;

import java.util.*;

public class Three_Sum {

    public static List<List<Integer>> threeSum(int[] arr, int n){
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                for (int k = j + 1; k < n; k++){
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        Collections.sort(temp);
                        if (!list.contains(temp))
                            list.add(temp);
                    }
                }
            }
        }
        return list;
    }
    // Time complexity - O(n^3)
    // Space complexity - O(k)


    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr, arr.length));
    }
}
