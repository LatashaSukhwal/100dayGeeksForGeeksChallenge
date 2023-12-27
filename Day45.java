import java.util.ArrayList;

class Solution {
    public int[] antiDiagonalPattern(int[][] matrix) {
        int n = matrix.length;
        int dia = 2 * n - 1;

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(dia);
        for (int i = 0; i < dia; i++) {
            arr.add(new ArrayList());
        }
        int[] output = new int[n * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr.get(i + j).add(matrix[i][j]);
            }
        }

        int curr = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                output[curr] = arr.get(i).get(j);
                curr++;
            }
        }
        return output;
    }
}

public class Day45 {
    public static void main(String[] args) {
        // Example usage:
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Solution solution = new Solution();
        int[] result = solution.antiDiagonalPattern(matrix);

        // Print the result
        System.out.println("Anti-Diagonal Pattern:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
