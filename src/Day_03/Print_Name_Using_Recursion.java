package Day_03;

public class Print_Name_Using_Recursion {

    public static void func(int i, int n){
        if (i > n)
            return;
        System.out.println("DSA");
        func(i+1,n);
    }

    public static void main(String[] args) {
        int n = 5;
        func(1, n);
    }
}
