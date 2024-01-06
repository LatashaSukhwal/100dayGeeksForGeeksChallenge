public class Day51 {
    public static void main(String[] args) {
        // Example usage of Solution class
        Solution solution = new Solution();

        // Test input array
        long[] array = {1, -2, 3, -1, 2};

        // Length of the array
        long n = array.length;

        // Value of k
        long k = 3;

        // Call the maxSumWithK method
        long result = solution.maxSumWithK(array, n, k);

        // Print the result
        System.out.println("Maximum sum with " + k + " elements is: " + result);
    }
}
