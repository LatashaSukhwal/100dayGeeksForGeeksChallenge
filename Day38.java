class Day38 {
    static class Solution {
        static int findWinner(int n, int A[]) {
            int xor = 0;
            for (int i = 0; i < n; i++) {
                xor ^= A[i];
            }

            if (xor == 0) {
                return 1;
            } else {
                return (n % 2) + 1;
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        int n = 5;
        int[] A = {1, 2, 3, 4, 5};

        int winner = Solution.findWinner(n, A);
        System.out.println("The winner is Player " + winner);
    }
}
