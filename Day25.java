class Solution {
    public int countX(int L, int R, int X) {
        int count = 0;

        for (int i = L + 1; i < R; i++) {
            int num = i; // Save the original value of i
            while (num > 0) {
                int digit = num % 10;
                if (digit == X) {
                    count++;
                }
                num /= 10;
            }
        }

        return count;
    }
}

public class Day25 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage with given range and digit
        int L = 10;
        int R = 50;
        int X = 5;

        int result = solution.countX(L, R, X);

        System.out.println("Count of digit " + X + " between " + L + " and " + R + ": " + result);
    }
}
