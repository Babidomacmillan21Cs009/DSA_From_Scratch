package Day_06;

public class SelectionSort {

    public static void selection_sort(int[] arr,int n){
        for (int i = 0; i <= n - 2; i++){
            int min = i;
            for (int j = i + 1; j < n; j++){
                if (arr[min] > arr[j])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i : arr){
            System.out.print(i + " ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        selection_sort(arr, arr.length);
    }
}
