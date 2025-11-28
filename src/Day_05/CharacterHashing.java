package Day_05;

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

    public static void main(String[] args) {
        String str = "abdeadef";
        String ch = "aczeb";
        countFrequency(str, ch);
    }
}