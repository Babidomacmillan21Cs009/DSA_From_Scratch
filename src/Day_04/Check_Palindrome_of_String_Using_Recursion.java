package Day_04;

public class Check_Palindrome_of_String_Using_Recursion {

    public static boolean isPalindrome(int l,String str){
        int n = str.length();
        if (l >= n / 2)
            return true;
        if (str.charAt(l) != str.charAt(n - l - 1))
            return false;
        return isPalindrome(l+1,str);
    }

    public static void main(String[] args) {
         String str = "madam";
         boolean result = isPalindrome(0, str);
        System.out.println(result);
    }
}
