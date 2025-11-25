package Day_02;

//            Given an integer x, return true if x is a palindrome, and false otherwise.
//            Input: x = 121
//            Output: true
//            Explanation: 121 reads as 121 from left to right and from right to left.


public class PalindromeNumber {

    public static boolean isPalindrome(int n){
        if (n < 0) return false;          // print false if negative value.
        int temp = n;
        int revNum = 0;
        while (temp != 0){
            int lastDigit = temp % 10;
            temp = temp / 10;
            revNum = revNum * 10 + lastDigit;
        }
        if (revNum == n) return true;
        else  return  false;
    }

    public static void main(String[] args) {
        int n = -123;
        boolean result = isPalindrome(n);
        System.out.println(result);
    }
}
