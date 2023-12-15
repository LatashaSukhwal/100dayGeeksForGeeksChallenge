import java.util.ArrayList;

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        ArrayList<Long> pre = new ArrayList<>();
        long mod = 1000000007;
        for (int i = 0; i < n; i++) {
            ArrayList<Long> current = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == i | j == 0) {
                    current.add(1L);
                } else {
                    long num = (pre.get(j) + pre.get(j - 1)) % mod;
                    current.add(num);
                }
            }
            pre = current;
        }
        return pre;
    }
}

public class Day14 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Testing the nthRowOfPascalTriangle method
        int n = 5;
        ArrayList<Long> result = solution.nthRowOfPascalTriangle(n);

        System.out.println("The " + n + "th row of Pascal's Triangle: " + result);
    }
}
