package Day_04;

//          f(0) = 0
//          f(1) = 1
//          f(n) = f(n - 1) + f(n - 2)

public class Fibonacci_Number {

    // Using Recursion
    public static int fibonacci(int n){        // TC --> O(2^n) nearly
        if(n <= 1)
            return n;
        int last = fibonacci(n - 1);
        int secondLast = fibonacci(n - 2);
        return last + secondLast;
    }

    // Using for loop
    public static int fib(int n){               // TC --> O(n)
        if (n <= 1)
            return n;
        int num1 = 0, num2 = 1, num3 = 0;
        for (int i = 2; i <=n; i++){            // we run a loop form 2 bcz we already knew the first 2 are f(0) = 1 and f(1) = 1
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return num3;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = fibonacci(n);
        System.out.println(result);
    }

}
