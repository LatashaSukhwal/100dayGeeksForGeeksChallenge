import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            StringBuilder curr = new StringBuilder();
            for (int j = 0; j < n; j++) {
                curr.append(matrix[i][j] + " ");
            }
            if (set.contains(curr.toString())) ans.add(i);
            set.add(curr.toString());
        }
        return ans;
    }
}

public class Day64 {
    public static void main(String[] args) {
        // Example usage of the repeatedRows method
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {1, 2, 3},
                {7, 8, 9}
        };
        int m = 4; // number of rows
        int n = 3; // number of columns

        ArrayList<Integer> result = Solution.repeatedRows(matrix, m, n);

        System.out.println("Rows with duplicates: " + result);
    }
}
