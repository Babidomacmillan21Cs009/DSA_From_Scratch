package Day_05;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.HashMap;
import java.util.Map;

public class CharacterHashing {

    public static void countFrequency(String str, String ch){
        int[] hash = new int[26];       // i used 26 bcz only lowercase if uppercase included
        // Precompute                                                  // we can use int[256] that time we do not need to (-)
        for (int i = 0; i < str.length(); i++){
            hash[str.charAt(i) - 'a'] += 1;
        }
        // Fetching
        for (int i = 0; i < ch.length(); i++){
            System.out.println(hash[ch.charAt(i) - 'a']);
        }
    }

    public static void frequency(String str, String ch){
        Map<Character, Integer> map = new HashMap<>();
        // Count frequency
        for (int i = 0; i <str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0) +1);
        }
        // fetching
        for (int i = 0; i < ch.length(); i++){
            System.out.println(map.getOrDefault(ch.charAt(i),0));
        }
    }

    public static void main(String[] args) {
        String str = "abcdbaf";
        String ch = "azcjb";
//        countFrequency(str, ch);
        frequency(str, ch);
    }
}