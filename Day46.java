public class Day46 {
    public static void main(String[] args) {
        // Example usage of the match function
        String wild = "ge*ks";  // Wildcard pattern
        String pattern1 = "geeks";  // Test pattern 1
        String pattern2 = "ge?ks";  // Test pattern 2
        String pattern3 = "g*k";  // Test pattern 3

        // Test 1
        boolean result1 = Solution.match(wild, pattern1);
        System.out.println("Result for pattern1: " + result1);

        // Test 2
        boolean result2 = Solution.match(wild, pattern2);
        System.out.println("Result for pattern2: " + result2);

        // Test 3
        boolean result3 = Solution.match(wild, pattern3);
        System.out.println("Result for pattern3: " + result3);
    }
}
