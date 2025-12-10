package Day_11;

public class Max_consecutive_ones {

    public static int findmaxOnes(int[] arr, int n){
        int maxOnes = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] == 1){
                cnt++;
                maxOnes = Math.max(maxOnes, cnt);
            }
            else
                cnt = 0;
        }
        return maxOnes;
    }
    // Time complexity - O(n)
    // Space complexity - O(1)

    public static void main(String[] args) {
        int[] arr ={1,1,0,1,1,1,0,1,1,1,1};
        System.out.println(findmaxOnes(arr, arr.length));
    }
}
