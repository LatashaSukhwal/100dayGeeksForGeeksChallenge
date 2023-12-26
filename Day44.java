import java.util.ArrayList;

public class Dagy44 {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 8, -6},
            {3, -2, 6, 7},
            {1, 8, -5, 4},
            {2, 6, -8, 3}
        };

        ArrayList<ArrayList<Integer>> result = sumZeroMatrix(matrix);

        System.out.println("Submatrix with the largest sum of elements equal to zero:");
        for (ArrayList<Integer> row : result) {
            System.out.println(row);
        }
    }

    public static ArrayList<ArrayList<Integer>> sumZeroMatrix(int[][] a) {
        // The existing code for sumZeroMatrix function
        // ... (unchanged)
    }
}
