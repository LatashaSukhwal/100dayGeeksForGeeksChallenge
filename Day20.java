class Solution {
    public int minStep(int n) {
        int count = 0;

        while (n > 1) {
            if (n % 3 == 0) {
                n /= 3;
            } else {
                n -= 1;
            }
            count++;
        }

        return count;
    }
}

public class Day20 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Testing the minStep method
        int n = 10;
        int result = solution.minStep(n);

        System.out.println("Minimum steps to reduce " + n + " to 1: " + result);
    }
}
