package Day_15;

public class StockBuyAndSell {

    // Brute forch
    public static int maxProfit(int[] arr, int n){
        int maxProfit = 0;
        for (int i = 0; i<= n-2; i++){
            for (int j = i + 1; j < n; j++){
               int profit = arr[j] - arr[i];
               if (profit > maxProfit)
                   maxProfit = profit;
            }
        }
        return maxProfit;
    }
    // Time complexity - O(n^2)
    // Space complexity - O(1)

    // Better
    public static int maximumProfit(int[] arr, int n){
        int maxProfit = 0;
        int minPrice = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] < minPrice)
                minPrice = arr[i];
            else {
                int profit = arr[i] - minPrice;
                if (maxProfit < profit)
                    maxProfit = profit;
            }
        }
        return maxProfit;
    }
    // Time complexity - O(n)
    // Space complexity - O(1)


    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
//        System.out.println(maxProfit(arr, arr.length));
        System.out.println(maximumProfit(arr, arr.length));
    }
}
