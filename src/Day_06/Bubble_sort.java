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

    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        bubble_sort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
