package Day_08;

public class Qucik_Sort {

    public static int func(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low, j = high;

        while(i < j){
            while (arr[i] <= pivot && i <= high - 1){
                i++;
            }
            while (arr[j] > pivot && j >= low + 1){
                j--;
            }
            if (i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pIndex = func(arr,low,high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr){
            System.out.print(i+ " ");
        }
    }
}
