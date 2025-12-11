package Day_12;

import java.util.ArrayList;
import java.util.List;

public class Find_all_nums_disappeared_in_array {

    public static List<Integer> findDisappearedNums(int[] arr, int n){
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int index = (arr[i] - 1) % n;       // if already changed get the original value index by doing %
            // checking does this one already marked bcz it has 1 - n then adding n leads to have greater than n such way we can find
            if (arr[index] <= n)
                arr[index] = arr[index] + n;
        }

        for (int i = 0; i < n; i++){
            if (arr[i] <= n)
                list.add(i + 1);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> list = findDisappearedNums(arr, arr.length);
        System.out.println(list);
    }
}
