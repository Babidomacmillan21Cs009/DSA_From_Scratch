package Day_09;

public class Rotate_array_by_K_places {

    public static void rotateArray(int[] arr, int k){
        if (k > 0){
            int temp = arr[arr.length -1];
            for (int i = arr.length - 2; i >= 0; i--){
                arr[i + 1] = arr[i];
            }
            arr[0] = temp;
            rotateArray(arr,k - 1);       // TC -> O(n * K) SC -> O(1)
        }
    }

    public static void rotate(int[] arr, int k, int n){
        k = k % n;     // When k is larger than array size.
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }


    public static void reverse(int[] arr, int start, int end){      // TC -> O(n)
        while(start < end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
//        rotateArray(arr, k);
        rotate(arr, k, arr.length);
        for (int i : arr){
            System.out.print(i +" ");
        }
    }
}
