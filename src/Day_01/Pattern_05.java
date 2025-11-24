package Day_01;

public class Pattern_05 {

    public static void print(int n){
        for (int i = 1; i <= n; i++){                   // if i and j starts from 0 then you go with i = 0; i < n j = 0; j < n-i
            for (int j = 1; j < n-i+1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
