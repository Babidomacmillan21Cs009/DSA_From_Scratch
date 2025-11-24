package Day_01;

public class Pattern_16 {

    public static void print(int n){
       for (int i = 0; i < n; i++){
           char ch = (char) ('A' + i);
           for (int j = 0; j <= i; j++){
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
