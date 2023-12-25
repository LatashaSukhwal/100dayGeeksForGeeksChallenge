public class Day43 {

    public static void main(String[] args) {
        // Example usage:
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = 3;

        Solution solution = new Solution();
        int determinant = solution.determinantOfMatrix(matrix, n);

        System.out.println("Determinant of the matrix is: " + determinant);
    }
}

class Solution {
    static int determinantOfMatrix(int matrix[][], int n) {
        if (n == 1) return matrix[0][0];
        if (n == 2) return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        int total = 0;
        int mat[][] = new int[n - 1][n - 1];
        for (int i = 0; i < n; i++) {
            for (int row = 1; row < n; row++) {
                int col_i = 0;
                for (int col = 0; col < n; col++) {
                    if (col == i) continue;
                    mat[row - 1][col_i++] = matrix[row][col];
                }
            }
            total += ((i % 2 == 0) ? 1 : -1) * matrix[0][i] * determinantOfMatrix(mat, n - 1);
        }
        return total;
    }
}
