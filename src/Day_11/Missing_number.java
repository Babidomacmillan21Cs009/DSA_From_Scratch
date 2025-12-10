package Day_11;

public class Missing_number {

    public static int findNum(int[] arr, int n){
        int misElem = 0;
        for (int i = 1; i <= n; i++){
            int flag = 0;
            for (int j = 0; j < arr.length; j++){       // we run a loop from 0 to n - 1 bcz one num is missing
                if (arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)              // if the flag does not changed that's the element is missing
                misElem = i;
        }
        return misElem;
    }
    // Time Complexity - O(n*n)
    // space Complexity - O(1)

    public static int missNum(int[] arr, int n){
        int misElem = 0;
        int[] hash = new int[n + 1];
        for (int i = 0; i < arr.length; i++){
            hash[arr[i]] = 1;
        }

        for (int i = 1; i < hash.length; i++){
            if (hash[i] == 0){
                misElem = i;
            }
        }
        return misElem;
    }
    // Time Complexity - O(n) + O(n) => O(n)
    // Space Complexity - O(n)

    public static int missingNum(int[] arr, int n){
        int sum = n * (n+1) / 2;
        for (int i : arr){
            sum -= i;
        }
        return sum;
    }
    // Time Complexity - O(n)
    // Space Complexity - O(1)

    public static int findMissingNumber(int[] arr, int n){
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < n - 1; i++){    // Iterate through the array
            xor2 = xor2 ^ arr[i];              // add every element in the arr to XOR2 like 1 ^ 2 ^ 4 ^ 5
            xor1 = xor1 ^ (i + 1);   // add the N natural nums to xor1 when i = 0 it take i = 1, then the loop runs 0 --> 3 in my case
        }                               // 1 ^ 2 ^ 3 ^ 4
        xor1 = xor1 ^ n;                    // add the last N num to xor1
        return xor1 ^ xor2;
    }
    // Time complexity - O(n)
    //Space Complexity - O(1)

    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
//        System.out.println(findNum(arr, 5));
//        System.out.println(missNum(arr, 5));
//        System.out.println(missingNum(arr, 5));
        System.out.println(findMissingNumber(arr, 5));
    }
}
