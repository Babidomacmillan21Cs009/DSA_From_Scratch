package Day_14;

public class SortZerosOnesAndTwos {

    // Brute forch --> Merge sort or quick sort

    // Better
    public static void sortZeroOneTwo(int[] arr, int n){
        int cnt0 = 0 , cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] == 0)
                cnt0++;
            else if (arr[i] == 1)
                cnt1++;
            else
                cnt2++;
        }

        for (int i = 0; i < cnt0; i++){
            arr[i] = 0;
        }
        for (int i = cnt0; i < cnt0 + cnt1; i++){
            arr[i] = 1;
        }
        for (int i = cnt0 + cnt1; i < n; i++){
            arr[i] = 2;
        }
    }
    // Time complexity - O(n)
    // Space complexity - O(1)

    public static void main(String[] args){
        int[] arr = {0,1,2,0,1,2,2,2,1,1,0,0,1};
        sortZeroOneTwo(arr, arr.length);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
