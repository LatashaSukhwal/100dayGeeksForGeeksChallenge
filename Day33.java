public class Day33 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test your nthPoint method with different values of n
        int result1 = solution.nthPoint(1);
        int result2 = solution.nthPoint(2);
        int result3 = solution.nthPoint(5);

        // Display the results
        System.out.println("Result for n=1: " + result1);
        System.out.println("Result for n=2: " + result2);
        System.out.println("Result for n=5: " + result3);
    }
}

class Solution {
    public int nthPoint(int n) {
        int a = 1, b = 2;
        int mod = 1000000007;

        if (n < 3) {
            return n;
        }

        for (int i = 3; i <= n; i++) {
            int temp = a;
            a = b % mod;
            b = (temp + a) % mod;
        }

        return b;
    }
}
