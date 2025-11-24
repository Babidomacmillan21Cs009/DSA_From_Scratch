package Day_01;

public class Pattern_12 {

    public static void print(int n){
        for (int i =1; i <= n; i++){
            // Number
            for (int j = 1; j <=i; j++){
                System.out.print(j);
            }
            // Space
            for (int j = 1; j <= 2*n - (2*i); j++){
                System.out.print(" ");
            }
            // Number
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
