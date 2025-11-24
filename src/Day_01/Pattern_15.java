package Day_01;

public class Pattern_15 {

    public static void print(int n){
        for (int i = 0; i < n; i++){
            for (char ch = 'A'; ch < 'A'+ (n-i); ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
