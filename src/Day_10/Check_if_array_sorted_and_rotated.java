package Day_10;

public class sortedRotated {

    public static boolean rotate(int[] arr, int n){
        int k = -1;
        for (int i = 0; i < n - 1; i++){
            if (arr[i] <= arr[i+1]){

            }else{
                k = i + 1;     // find the unorder num index
            }
        }
        if (k == -1)        // after for loop if still k = -1 then it already sorted
            return true;

        reverse(arr,0,k - 1);           // reverse before k
        reverse(arr,  k, n - 1);            // reverse after k
        reverse(arr, 0, n - 1);         // reverse whole array

        for (int i = 0; i < n - 1; i++){
            if (arr[i] > arr[i + 1])     // duplicates are allowed so we shouldn't check =
                return false;
        }
        return true;                    // after reverse check the order if yes -> then it sorted and rotated
    }


    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3,3};
        System.out.println(rotate(arr, arr.length));
    }
}
