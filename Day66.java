class Solution {
    static int helper(int index, int num, int m, int n) {
        if (index > n || num > m) {
            return 0;
        }
        if (index == n) {
            if (num <= m) {
                return 1;
            }
            return 0;
        }
        int pick = 0;
        for (int i = 0; i <= m - num; i++) {
            if (2 * num + i <= m) {
                pick += helper(index + 1, 2 * num + i, m, n);
            }
        }
        return pick;
    }

    static int numberSequence(int m, int n) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += helper(1, i, m, n);
        }
        return count;
    }
}

public class Day66 {
    public static void main(String[] args) {
        int m = 10;  // You can change the values for m and n as needed
        int n = 3;
        int result = Solution.numberSequence(m, n);
        System.out.println("Number of sequences: " + result);
    }
}
