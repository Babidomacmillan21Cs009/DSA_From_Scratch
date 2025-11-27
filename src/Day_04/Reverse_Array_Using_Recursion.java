package Day_04;

public class Reverse_Array_Using_Recursion {

    // Using two parameters  l and r
    public static void swap(int l, int r, int[] arr){
        if (l >= r)
            return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        swap(l+1,r-1,arr);
    }

    // only using one parameter l
    public static void reverse(int l,int[] arr){
        int n = arr.length;
        if (l >= n / 2)
            return;
        int  temp = arr[l];
        arr[l] = arr[n - l - 1];
        arr[n - l -1] = temp;
        reverse(l + 1, arr);
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        swap(0,arr.length-1,arr);
        for (int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Using one parameter");
        reverse(0,arr);
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}
