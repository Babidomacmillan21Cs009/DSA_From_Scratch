package Day_08;

public class SecondLargest {

    public static int secondMax(int[] arr, int n){
        int firstMax = arr[0];
        int secondMax = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if (arr[i] > secondMax && firstMax != arr[i])
                secondMax = arr[i];
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,5,7,6};
        System.out.println(secondMax(arr,arr.length));
    }
}
