package Day_01;

public class Pattern_07 {

    public static void print(int n){
        for (int i = 0; i < n; i++){
            // Space
            for (int j = 0; j < n - i; j++){
                System.out.print(" ");
            }

            // Star
            for (int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }

            //Space
            for (int j = 0; j < n - i; j++){
                System.out.print("  ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
