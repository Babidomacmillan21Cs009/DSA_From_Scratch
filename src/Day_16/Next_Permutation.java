package Day_16;

public class Next_Permutation {

    public static void nextPermutation(int[] arr, int n){
        int index = -1;
        for (int i = n - 2; i >= 0; i--){
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;         // once found breaking point break it, if not it will run full loop and find it extremely left
            }
        }
        if (index == -1) {
            reverse(arr, 0, n - 1);  // if not found it is the last permutation, so reverse it ,since it is sorted
            return;
        }
        for (int i = n - 1; i > index; i--){
            if (arr[index] < arr[i]) {    // find larger elem than pivot elem but it should be smallest one among them
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;        // since it is sorted in right, run loop from last -- > index + 1 find the first larger elem then swap
            }
        }
        reverse(arr, index + 1, n - 1);   // Then reverse remaining elem to make small it always in sorted 5 3 2 --> 2 3 5
    }

    public static void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
        int[] arr = {7,1,4,5,6,3,2};        // 7 1 4 6 2 3 5
        nextPermutation(arr, arr.length);
        System.out.println();
        for (int i : arr){
            System.out.print(i+" ");
        }

    }
}
