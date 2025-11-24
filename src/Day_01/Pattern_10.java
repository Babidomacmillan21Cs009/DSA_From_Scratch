package Day_01;

public class Pattern_10 {

    public static void print(int n){
        for (int i = 1; i <= 2*n -1; i++){
            int starts = i;
            if (i > n) starts = 2*n -i;
            for (int j = 1; j <= starts; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
