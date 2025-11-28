package Day_05;

public class Frequency_Counting_using_Array_Hashing {

    public static void countFrequency(int[] arr, int[] nums){
        // we mentioned size as 13 to access 12th num in index  0 --> 12
        int[] hash = new int[13];
        // precompute
        for (int i = 0; i < arr.length; i++){
            hash[arr[i]]++;
        }
        // Fetch
        for (int num : nums){
            System.out.println(hash[num]);
        }

    }


    public static void main(String[] args) {
        int[] arr = {1,3,2,1,3};
        int[] nums = {1,4,3,2,12};
        int[] array = new int[10000000];
        countFrequency(arr,nums);

    }
}
