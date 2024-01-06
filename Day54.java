public class Day54 {
    public static void main(String[] args) {
        // Example usage:
        Solution solution = new Solution();

        // Example input value N
        int N = 5;

        int result = solution.TotalWays(N);
        System.out.println("Total ways for N = " + N + ": " + result);
    }
}

class Solution {
    public int TotalWays(int N) {
        long mod = 1000000007;
        long ans = 0, curr = 1, prev = 1;
        for (int i = 1; i <= N; i++) {
            ans = (prev + curr) % mod;
            prev = curr;
            curr = ans;
        }

        ans = (ans * ans) % mod;
        return (int) ans;
    }
}
