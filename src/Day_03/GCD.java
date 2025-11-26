package Day_03;

//        The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.
//            Input: n1 = 4, n2 = 6
//            Output: 2
//            Explanation: Divisors of n1 = 1, 2, 4, Divisors of n2 = 1, 2, 3, 6
//            Greatest Common divisor = 2.


public class GCD {

    public static int gcd(int a, int b){
        while (b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 15 , b = 20;
        int result = gcd(a,b);
        System.out.println(result);
    }
}
