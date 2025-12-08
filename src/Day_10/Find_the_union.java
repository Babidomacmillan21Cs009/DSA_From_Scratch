package Day_10;

import java.util.Set;
import java.util.TreeSet;

public class Find_the_union {

    public static int[] unionArray(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n1; i++){
            set.add(arr1[i]);
        }
        for (int i = 0; i < n2; i++){
            set.add(arr2[i]);
        }

        int[] union = new int[set.size()];
        int i = 0;
        for (int st : set){
            union[i++] = st;
        }

        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,3,4,5};
        int[] arr2 = {2,3,3,4,5,5,10};
        int[] union = unionArray(arr1, arr2);
        for (int i : union){
            System.out.print(i+" ");
        }
    }
}
