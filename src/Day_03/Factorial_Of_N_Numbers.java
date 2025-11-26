package Day_03;

//  n = 3     1 * 2 * 3 = 6
//  n = 5     1 * 2 * 3 * 4 * 5 = 120

public class Factorial_Of_N_Numbers {

    // Parameterized Way
    public static void factorial(int n, int sum){
        if (n == 1){
            System.out.println(sum);
            return;
        }
        factorial(n - 1, sum * n);
    }

    // Fuctional Way
    public static int factorial(int n){
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }


    public static void main(String[] args) {
        int n = 3;
        factorial(n,1);
        int result = factorial(n);
        System.out.println(result);
    }
}
