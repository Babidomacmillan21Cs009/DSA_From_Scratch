package Day_03;

//  n = 3    1 + 2 + 3 = 6
//  n = 5    1 + 2 + 3 + 4 + 5 = 15

public class Sum_of_first_N_Num {

    // Parameterized Way
    public static void calculateSum(int i, int sum){
        if (i < 1){
            System.out.println(sum);
            return;
        }
        calculateSum(i-1,sum+i);
    }

    // Functional Way
    public static int calculateSum(int n){
        if (n == 0)
            return 0;
        return n + calculateSum(n - 1);
    }


    public static void main(String[] args) {
        int n = 5;
        calculateSum(n, 0);
        int result = calculateSum(n);
        System.out.println(result);
    }
}
