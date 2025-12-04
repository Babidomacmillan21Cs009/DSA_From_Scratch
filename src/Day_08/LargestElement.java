package Day_08;

public class LargestElement {

    public static int largeElement(int[] arr, int n){
       int maxElem = arr[0];
       for (int i = 0; i < n; i++){
           if (arr[i] > maxElem)
               maxElem = arr[i];
       }
       return maxElem;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,53,2,16,75};
        System.out.println(largeElement(arr,arr.length));
    }
}
