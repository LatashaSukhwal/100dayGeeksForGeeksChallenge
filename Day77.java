import java.util.Arrays;

class Day77 {
    static class Solution {
        static int help(String str, int index, int preSum, int dp[][]) {
            if (index == str.length()) return 1;
            if (dp[index][preSum] != -1) return dp[index][preSum];
            int curSum = 0, ans = 0;
            for (int i = index; i < str.length(); i++) {
                curSum += str.charAt(i) - '0';
                if (curSum >= preSum) {
                    ans += help(str, i + 1, curSum, dp);
                }
            }
            return dp[index][preSum] = ans;
        }

        public int TotalCount(String str) {
            int n = str.length();
            int dp[][] = new int[n][901];
            for (int temp[] : dp) Arrays.fill(temp, -1);
            return help(str, 0, 0, dp);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "12345"; // Example string, you can change it accordingly
        int totalCount = solution.TotalCount(str);
        System.out.println("Total Count: " + totalCount);
    }
}
