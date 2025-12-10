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
    // Time Complexity - O(n1 * n2);
    // Space Complexity - O(n1 + n2)

    // Optimal
    public static void intersecArray(int[] a, int[] b){
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();

        while (i < n1 && j < n2){
            if (a[i] == b[j]){
                list.add(a[i]);
                i++;
                j++;
            }
            else if (a[i] < b[j]){
                i++;
            }
            else{
                j++;
            }
        }

        for (int li : list){
            System.out.print(li+" ");
        }
    }
    // Time Complexity - O(n1 + n2) worst case
    // Space Complexity - O(min(n1 + n2))


    public static void main(String[] args) {
        int[] a = {1,2,2,3,6};
        int[] b = {2,3,3,5,6,6,7};
//        intersection(a, b);
        intersecArray(a, b);


    }
}
