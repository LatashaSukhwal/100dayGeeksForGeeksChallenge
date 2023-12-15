import java.util.HashSet;

class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[], int n) {
        // HashSet to store prefix sums
        HashSet<Integer> set = new HashSet<>();

        // Initialize prefix sum
        int prefixSum = 0;

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // Add the current element to the prefix sum
            prefixSum += arr[i];

            // If the current prefix sum is 0 or it has been seen before,
            // then there is a subarray with sum 0
            if (prefixSum == 0 || set.contains(prefixSum)) {
                return true;
            }

            // Add the current prefix sum to the set
            set.add(prefixSum);
        }

        // If no subarray with sum 0 is found
        return false;
    }
}

public class Day29 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage with a sample array
        int[] arr = {4, 2, -3, 1, 6};

        boolean result = solution.findsum(arr, arr.length);

        System.out.println("Is there a subarray with sum 0? " + (result ? "Yes" : "No"));
    }
}
