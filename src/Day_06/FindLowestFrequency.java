package Day_06;

import java.util.HashMap;
import java.util.Map;

public class FindLowestFrequency {

    public static void countFrequncies(int[] arr, int n){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        }

        int maxFreq = 0 ,minFreq = n;
        int maxElem = 0, minElem = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int element = entry.getKey();
            int freq = entry.getValue();

            if (maxFreq < freq){
                maxFreq = freq;
                maxElem = element;
            }
            else if (maxFreq == freq) {
                if (maxElem > freq)
                    maxElem = element;
            }

            if (minFreq > freq){
                minFreq = freq;
                minElem = element;
            }
            else if (minFreq == freq) {
                if (minElem > element)
                    minElem = element;
            }
        }
        System.out.println("Max Element : "+ maxElem);
        System.out.println("Min Element : "+ minElem);
    }

    public static void main(String[] args) {
        int[] arr = {10,5,10,5,15,15};
        countFrequncies(arr,arr.length);
    }
}
