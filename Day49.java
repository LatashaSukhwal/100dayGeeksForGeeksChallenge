public class Day49 {
    public static void main(String[] args) {
        // Example usage:
        Solution solution = new Solution();

        // Example input values
        int n = 3;
        int[] coins = {4, 5, 6};

        boolean result = solution.isPossible(n, coins);
        System.out.println("Is it possible to obtain the desired sum? " + result);
    }
}

class Solution {
    public static boolean isPossible(int n, int[] coins) {
        return helper(0, coins, n, 0);
    }

    public static boolean helper(int idx, int coins[], int n, int sum) {
        if (sum != 0 && (sum % 2024 == 0 || sum % 20 == 0 || sum % 24 == 0)) {
            return true;
        }
        if (idx == coins.length) {
            return false;
        }

        boolean temp1 = helper(idx + 1, coins, n, sum + coins[idx]);
        if (temp1 == true) return true;

        boolean temp2 = helper(idx + 1, coins, n, sum);
        if (temp2 == true) return true;

        return false;
    }
}
