package Day_08;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray{

    public static int removeDuplicates(int[] arr, int n){
        int i = 0;                      //slow pointer
        for (int j = 1; j < n; j++){
            if (arr[j] != arr[i]){
                arr[i + 1] = arr[j];    // place the new unique element next to i
                i++;                    // to track new unique elements
            }
        }
        return i + 1;       // it's a new length
    }


    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4};
        System.out.println(removeDuplicates(arr, arr.length));
    }
}