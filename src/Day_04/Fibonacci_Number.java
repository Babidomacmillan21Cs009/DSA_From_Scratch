package Day_04;

//          f(0) = 0
//          f(1) = 1
//          f(n) = f(n - 1) + f(n - 2)

public class Fibonacci_Number {

    // Using Recursion
    public static int fibonacci(int n){
        if(n <= 1)
            return n;
        int last = fibonacci(n - 1);
        int secondLast = fibonacci(n - 2);
        return last + secondLast;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = fibonacci(n);
        System.out.println(result);
    }

}
