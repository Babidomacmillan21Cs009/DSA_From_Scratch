package Day_07;

import java.util.ArrayList;
import java.util.List;

public class Merge_sort {

    public static void merge(int[] arr, int low, int mid, int high){
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if (arr[left] < arr[right]){
                list.add(arr[left]);
                left++;
            }
            else {
                list.add(arr[right]);
                right++;
            }
        }
        while(right <= high){    // copy all the remaining elements from right
            list.add(arr[right]);
            right++;
        }
        while(left <= mid){   // copy all the remaining elements from left
            list.add(arr[left]);
            left++;
        }

        // copy elements to original array
        int k = 0;
        for (int i = low; i <= high; i++){
            arr[i] = list.get(k++);
        }
    }


    public static void mergeSort(int[] arr, int low, int high){
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);             // Assume it will sort and give the smaller version of left half
        mergeSort(arr, mid +1, high);   // Assume it will sort and give the smaller version of right half
        merge(arr, low, mid, high);         // merge both halves
    }


    public static void main(String[] args) {
        int[] arr = {3,1,2,4,1,5,2,6,4};
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
