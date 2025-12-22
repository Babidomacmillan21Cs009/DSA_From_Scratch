package Day_21;

import java.awt.datatransfer.FlavorListener;
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

    public static List<List<Integer>> threeSumBetter(int[] arr, int n){
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++){
            Set<Integer> hashSet = new HashSet<>();
            for (int j = i + 1; j < n; j++){
                int third = -(arr[i] + arr[j]);
                if (hashSet.contains(third)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(third);
                    Collections.sort(temp);
                    set.add(temp);
                }
                hashSet.add(arr[j]);
            }
        }
        return new ArrayList<>(set);
    }
    // Time complexity - O(n^2)
    // Space complexity - O(k)

    public static List<List<Integer>> threeSumOptimal(int[] arr, int n){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++){
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0)
                    j++;
                else if (sum > 0)
                    k--;
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    list.add(temp);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1])  // move j till k
                        j++;
                    while (j < k && arr[k] == arr[k + 1])
                        k--;
                }
            }
        }
        return list;
    }
    // Time complexity - O(n log n) + near about O(n^2)
    // Space complexity - O(k) but we used to store only (no.of unique elements)


    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr, arr.length));
        System.out.println(threeSumBetter(arr, arr.length));
        System.out.println(threeSumOptimal(arr, arr.length));
    }
}
