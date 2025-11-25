package Day_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//         You are given an integer n. You need to find all the divisors of n.
//         Return all the divisors of n as an array or list in a sorted order.
//         A number which completely divides another number is called it's divisor.

//            Input: n = 6
//            Output = [1, 2, 3, 6]
//            Explanation: The divisors of 6 are 1, 2, 3, 6.

public class Print_All_Divisors {

    public static void printAllDivisors(int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){                   // find the first divisor
                list.add(i);
                if((n / i) != i){              // find second divisor
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        for (int num: list){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        int n = 36;
        printAllDivisors(n);
    }
}
