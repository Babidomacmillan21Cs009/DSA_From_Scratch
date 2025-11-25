package Day_02;

//    You are given an integer n. Return the integer formed by placing the digits of n in reverse order.
//    Example 1:
//
//    Input: x = 123
//    Output: 321


public class Reverse_A_Number {

    public static int reverseNum(int n){
        int revNum = 0;
        while (n != 0){
            int lastDigit = n % 10;
            n = n / 10;
            if (revNum > Integer.MAX_VALUE / 10 || revNum < Integer.MIN_VALUE / 10){    // if overflow then return 0.
                return 0;
            }
            revNum = revNum * 10 + lastDigit;
        }
        return revNum;
    }

    public static void main(String[] args) {
        int n = 754;
        int result = reverseNum(n);
        System.out.println(result);
    }
}
