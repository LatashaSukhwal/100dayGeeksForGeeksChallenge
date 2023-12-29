public class Day47 {
    public static void main(String[] args) {
        // Example usage of the Solution class
        Solution solution = new Solution();
        
        // Replace the following values with your actual inputs
        int n = 12;  // Length of the string
        String s = "abcabcabcabc";  // The input string
        int k = 3;  // The length of each substring
        
        // Call the kSubstrConcat method
        int result = solution.kSubstrConcat(n, s, k);
        
        // Print the result
        System.out.println(result);
    }

    static class Solution {
        int kSubstrConcat(int n, String s, int k) {
            // Your existing code here
            if (n % k != 0) return 0;
            String ss = s.substring(0, k);
            int cnt = n / k;
            int mod = 0;
            for (int i = 0, j = 0; j < cnt; i = i + k, j++) {
                if (!s.substring(i, i + k).equals(ss)) {
                    mod++;
                }
            }
            if (mod > 1) {
                mod = 0;
                String sss = s.substring(n - k, n);
                for (int i = n - k, j = 0; j < cnt; i = i - k, j++) {
                    if (!s.substring(i, i + k).equals(sss)) {
                        mod++;
                        if (mod > 1) return 0;
                    }
                }
            }
            return 1;
        }
    }
}
