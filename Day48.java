import java.util.Arrays;

public class Day48 {

    public static void main(String[] args) {
        // Example usage of the winner method
        String[] candidates = {"Alice", "Bob", "Charlie", "Alice", "Bob", "Alice", "Charlie", "Alice"};
        int totalVotes = candidates.length;

        // Calling the winner method
        String[] result = Solution.winner(candidates, totalVotes);

        // Displaying the result
        System.out.println("Winner: " + result[0]);
        System.out.println("Votes: " + result[1]);
    }

    // The Solution class with the winner method and LexicographicComparator
    static class Solution {

        public static String[] winner(String arr[], int n) {
            // The implementation of the winner method remains the same
            // ...

            return result;
        }

        static class LexicographicComparator implements Comparator<String> {
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        }
    }
}
