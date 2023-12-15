class Solution {
    static int maxGold(int n, int m, int M[][]) {
        int ans = 0;
        // starting from the last second last col
        for (int col = m - 2; col >= 0; col--) {
            for (int row = 0; row < n; row++) {
                int temp = M[row][col + 1];
                if (row - 1 >= 0) {
                    temp = Math.max(M[row - 1][col + 1], temp);
                }
                if (row + 1 < n) {
                    temp = Math.max(M[row + 1][col + 1], temp);
                }
                M[row][col] = M[row][col] + temp;
                if (col == 0) {
                    ans = Math.max(M[row][col], ans);
                }
            }
        }
        return ans;
    }
}

public class Day31 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage with a sample 2D array
        int n = 3;
        int m = 3;
        int[][] M = {
            {1, 3, 3},
            {2, 1, 4},
            {0, 6, 4}
        };

        int result = solution.maxGold(n, m, M);

        System.out.println("Maximum gold collected: " + result);
    }
}
