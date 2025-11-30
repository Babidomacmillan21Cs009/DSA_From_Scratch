package Day_07;

public class Insertion_sort {

    public static void insertionSort(int[] arr, int n){
        for (int i = 0; i < n; i++){
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {9,14,15,12,6,8,13};
        insertionSort(arr, arr.length);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
