class Solution {
    long countWays(int n, int k) {
        long mod = 1000000007;
        if (n == 1) {
            return k;
        }

        long same = 0;
        long diff = k;

        for (int i = 2; i <= n; i++) {
            long prev = same;
            same = diff;
            diff = (prev + same) * (k - 1) % mod;
        }
        return (same + diff) % mod;
    }
}

public class Day32 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage with sample values
        int n = 3;
        int k = 2;

        long result = solution.countWays(n, k);

        System.out.println("Number of ways to color the fence: " + result);
    }
}
