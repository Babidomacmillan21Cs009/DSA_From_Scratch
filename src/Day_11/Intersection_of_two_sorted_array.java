package Day_11;

import java.util.ArrayList;
import java.util.List;

public class Intersection_of_two_sorted_array {

    public static void intersection(int[] a, int[] b){
        int n1 = a.length;
        int n2 = b.length;
        List<Integer> list = new ArrayList<>();
        int[] vis = new int[n2];

        for (int i = 0; i < n1; i++){
            for (int j = 0; j < n2; j++){
                if (a[i] == b[j] && vis[j] == 0){
                    list.add(a[i]);
                    vis[j] = 1;
                    break;
                }
                if (a[i] < b[j])
                    break;
            }
        }
        for (int i : list){
            System.out.print(i+" ");
        }
    }


    public static void main(String[] args) {
        int[] a = {1,2,2,3,3,4,5,6};
        int[] b = {2,3,3,5,6,6,7};
        intersection(a, b);
    }
}
