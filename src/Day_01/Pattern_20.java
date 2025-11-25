package Day_01;

public class Pattern_20 {

    public static void print(int n){
        int spaces = 2*n - 2;
        for (int i = 1; i <= 2*n -1; i++){
            int stars = i;
            if (i > n) stars = 2*n - i;
            // Star
            for (int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            // Space
            for (int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            // Star
            for (int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            if (i < n) spaces -= 2;
            else spaces += 2;
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
