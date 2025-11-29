package Day_06;
import java.util.HashMap;
import java.util.Map;


//            Input: nums = [1, 2, 2, 3, 3, 3]
//            Output: 3
//            Input: nums = [4, 4, 5, 5, 6]
//            Output: 4      -- > 4 is the smallest one

public class FindHighestFrequency {

    public static int mostFrequentElement(int[] arr, int n){
        Map<Integer, Integer> map = new HashMap<>();
        // Precompute
        for (int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        }

        int maxFreq = 0;
        int maxElem = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int freq = entry.getValue();

            if (maxFreq < freq){
                maxFreq = freq;
                maxElem = element;
            }
            else if (maxFreq == freq){
                if (maxElem > element)
                    maxElem = element;
            }
        }
        return maxElem;
    }


    public static void main(String[] args) {
        int[] arr = {1,1,2,2};
        System.out.println(mostFrequentElement(arr , arr.length));
    }
}
