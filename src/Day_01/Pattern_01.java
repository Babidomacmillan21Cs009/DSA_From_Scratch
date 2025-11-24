package Day_01;


/*
 1. for the outer loop count the no.of rows   --> for (int i = 0; i < n; i++)
 2. for the inner loop focus on columns and somehow connect them to rows
 3. print * inside the for loop then move to next line after 1st loop destroyed. -->  System.out.println(" ");
 */

public class Pattern_01 {

    public static void print(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args){
        int n = 7;
        print(n);
    }
}
