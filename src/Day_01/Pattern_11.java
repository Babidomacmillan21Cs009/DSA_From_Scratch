package Day_01;

public class Pattern_11 {

    public static void print(int n){

        for (int i = 0; i < n; i++){
            int starts = 1;
            if (i % 2 == 0) starts = 1;
            else starts = 0;
            for (int j = 0; j <= i; j++){
                System.out.print(starts+" ");
                starts = 1 - starts;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
