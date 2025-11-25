package Day_01;

public class Pattern_19 {
    public static void print(int n){
//        for (int i = 1; i <= 2*n; i++){
//            int starts = n - i + 1;
//            int space = 2*i -2;
//            if (i > n){
//                starts = i - n;
//                space = 20 - 2 * i;
//            }
//            for (int j = 1; j <= starts; j++){
//                System.out.print("*");
//            }
//
//            for (int j = 1; j <= space; j++){
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= starts; j++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

        for (int i = 0; i < n; i++){
            // Star
            for (int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            // Space
            for (int j = 0; j < i*2; j++){
                System.out.print(" ");
            }
            // Star
            for (int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        int iniS = 2*n - 2;
        for (int i = 1; i <= n; i++){
            // Star
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // Space
            for (int j = 1; j <= iniS ; j++){
                System.out.print(" ");
            }
            // Star
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            iniS -= 2;
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
