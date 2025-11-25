package Day_02;


//        You are given an integer n. You need to return the number of digits in the number.
//
//        The number will have no leading zeroes, except when the number is 0 itself.

//            Input: n = 4
//            Output: 1
//            Explanation: There is only 1 digit in 4.


public class CountDigits {

    public static int noOfDigits(int n){
        int count = 0;
        while (n > 0){
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 7789;
        int result = noOfDigits(n);
        System.out.println("No of Digits of " + n + " is "+ result);
    }
}
