package Day_03;

public class GCD {

    public static int gcd(int a, int b){
        while (b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 15 , b = 20;
        int result = gcd(a,b);
        System.out.println(result);
    }
}
