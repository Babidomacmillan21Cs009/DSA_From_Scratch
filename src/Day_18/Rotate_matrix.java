package Day_18;

public class Rotate_matrix {

    public static int[][] rotateMatrix(int[][] matrix){
        int n = matrix.length;
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                ans[j][n-1-i] = matrix[i][j];
            }
        }
        return ans;
    }
    // Time complexity - O(n^2)
    // Space complexity - O(n^2)

    // Optimal
    public static void rotateMatrix90Degree(int[][] matrix){
        int n = matrix.length;
        for (int i = 0; i <= n - 2; i++){
            for (int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++){
            int start = 0, end = n -1;
            while (start < end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
    // Time complexity - O(n^2)
    // Space complexity - O(1)


    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
//        int[][] ans = rotateMatrix(matrix);
        rotateMatrix90Degree(matrix);
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j <matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
