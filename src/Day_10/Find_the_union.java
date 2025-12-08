package Day_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Find_the_union {

    // Brute forch
    public static int[] unionArray(int[] arr1, int[] arr2){   // TC -> O(n1 log n + n2 log n) + O(n1 + n2)
        int n1 = arr1.length;                                 // SC -> O(n1 + n2)
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


    // Optimal
    public static List<Integer> unionArr(int[] arr1 , int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;

        List<Integer> list = new ArrayList<>();
        while (i < n1 && j < n2){
            if (arr1[i] <= arr2[j]){        // we check = also bcz if both elem are same we move i pointer
                if (list.size() == 0 || list.get(list.size() - 1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;  // we placed i++ outside if already elem is same or not same it will move
            }
            else{
                if (list.size() == 0 || list.get(list.size() - 1) != arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while (j < n2){
            if (list.size() == 0 || list.get(list.size() - 1) != arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        while (i < n1){
            if (list.size() == 0 || list.get(list.size() - 1) != arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,3,4,5};
        int[] arr2 = {2,3,3,4,5,5,6};
//        int[] union = unionArray(arr1, arr2);
        List<Integer> union = unionArr(arr1, arr2);
        for (int i : union){
            System.out.print(i+" ");
        }
    }
}
