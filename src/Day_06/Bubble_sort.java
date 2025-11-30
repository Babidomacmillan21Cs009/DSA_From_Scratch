package Day_06;

public class Bubble_sort {

    public static void bubble_sort(int[] arr){
        int n = arr.length;
        for (int i = n - 1; i >= 1; i--){
            for (int j = 0; j <= i - 1; j++){        // j goes to only before i because we are checking arr[j] > arr[j+1]
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void buble_sort(int[] arr, int start, int end){
        if (end == 0)    // only one element left . it already sorted
            return;
        // one full bubble sort
        for (int i = start; i < end; i++){
            if (arr[i] > arr[i + 1]){
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        // recursively sort remaining part
        buble_sort(arr, start, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        bubble_sort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--- Using Recursion ---");
        int[] arr1 = {4,3,2,1};
        buble_sort(arr1, 0, arr1.length - 1);
        for (int i : arr1){
            System.out.print(i+" ");
        }
    }
}
