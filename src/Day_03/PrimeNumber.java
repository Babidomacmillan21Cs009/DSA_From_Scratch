package Day_03;

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
