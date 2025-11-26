package Day_03;

public class RecursionProblems {

    public static void func(int i, int n){
        if (i > n)
            return;
        System.out.println(i);
        func(i+1, n);
    }

    public static void func_1(int n, int i){
        if (n < i)
            return;
        System.out.println(n);
        func_1(n-1,i);
    }

    public static void byBacktracking(int i){         // i = 3
        if (i < 1)
            return;
        byBacktracking(i-1);
        System.out.println(i);
    }

    public static void byBackTracking(int i, int n){
        if (i > 4)
            return;
        byBackTracking(i+1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Printing 1 --> N");
        func(1, n);
        System.out.println("Printing N --> 1");
        func_1(n, 1);

        System.out.println("Printing 1 --> n By Backtracking");
        byBacktracking(3);
        System.out.println("Printing n --> 1 By Backtracking");
        byBackTracking(1,4);

    }
}
