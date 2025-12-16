package Day_17;

public class Set_Matrix_to_Zero {

    // brute forch
    public static void setZero(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == 0){
                    markRow(i, matrix);         // find zero position
                    markColumn(j, matrix);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == -1){                // if -1 then make it as 0
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void markRow(int i, int[][] matrix){
        for (int j = 0; j < matrix[i].length; j++){
            if (matrix[i][j] != 0){                 // mark non zero elements in row so we can later change int 0
                matrix[i][j] = -1;
            }
        }
    }

    public static void markColumn(int j, int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][j] != 0){         // mark non zero elements in column so we can later change int 0
                matrix[i][j] = -1;
            }
        }
    }
    // TIme complexity- O(n * m * (n + m))
    // Space complexity - O(1)

    // Better
    public static void setMatrixZero(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        int[] row = new int[n];
        int[] col = new int[m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (row[i] == 1 || col[j] == 1)
                    arr[i][j] = 0;
            }
        }
    }
    // Time complexity - O(2 * n * m)
    // Space complexity - O(n) + O(m)

    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1,1},
                {1,0,0,1},
                {1,1,0,1},
                {1,1,1,1}
        };

//        setZero(matrix);
        setMatrixZero(matrix);
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
