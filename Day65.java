class Day65 {
    public int maxcost(int ind, int total, int cost[], int dp[][]) {
        if (ind == cost.length) {
            return 0;
        }
        if (dp[ind][total] != -1) return dp[ind][total];
        int notpick = maxcost(ind + 1, total, cost, dp);
        int pick = Integer.MIN_VALUE;
        if (cost[ind] <= total) {
            int val = total - cost[ind] + (int) (Math.floor(0.9 * cost[ind]));
            pick = 1 + maxcost(ind + 1, val, cost, dp);
        }
        return dp[ind][total] = Math.max(notpick, pick);
    }

    public int max_courses(int n, int total, int[] cost) {
        int dp[][] = new int[n][total + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < total + 1; j++) {
                dp[i][j] = -1;
            }
        }
        return maxcost(0, total, cost, dp);
    }

    public static void main(String[] args) {
        Day65 solution = new Day65();

        // Example usage
        int n = 3; // replace with the actual size of your cost array
        int total = 10; // replace with the actual total value
        int[] cost = {3, 5, 7}; // replace with your actual cost array

        int result = solution.max_courses(n, total, cost);
        System.out.println("Maximum number of courses: " + result);
    }
}

