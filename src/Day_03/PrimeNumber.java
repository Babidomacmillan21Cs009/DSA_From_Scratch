package Day_03;

//            Input: n = 5
//            Output: true
//            Explanation: The only divisors of 5 are 1 and 5 , So the number 5 is prime.

public class PrimeNumber {

    public static boolean isPrime(int n){
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                count++;
                if (n / i != i){
                    count++;
                }
            }
        }
        if (count == 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n = 11;
        boolean result = isPrime(n);
        System.out.println(result);
    }
}
