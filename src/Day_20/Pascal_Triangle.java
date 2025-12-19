package Day_20;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {

    // find the row and col element
    public static int pascalNcR(int n, int r){
        int res = 1;
        for (int i = 0; i < Math.min(r , n - r); i++){
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
    // Time complexity - O(r)
    // Space complexity - O(1)

//    public static void printNthRow(int n){
//        for (int r = 1; r <= n; r++){
//            System.out.print(pascalNcR(n-1,r-1)+" ");
//        }
//    }


    public static List<Integer> generateRow(int n){
        List<Integer> list = new ArrayList<>();
        int ans = 1;
        list.add(ans);
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            list.add(ans);
        }
        return list;
    }


    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            List<Integer> temp = generateRow(i);
            list.add(temp);
        }
        return list;
    }
    // Time complexity - O(n^2)
    // Space complexity - O(1)  we used list to store the ans only we didn't compute it.

    public static void main(String[] args) {
        int r = 5;
        int c = 3;
        System.out.println(pascalNcR(r - 1, c - 1));
        generateRow(6);
        System.out.println(pascalTriangle(6));
    }
}
