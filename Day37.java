class Day37 {
    // Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n) {
        int xor = m ^ n;
        if (xor == 0) return -1;
        int cnt = 1;
        while (xor > 0) {
            if ((xor & 1) != 0) return cnt;
            xor >>= 1;
            cnt++;
        }
        return -1;
    }

    // Main function for testing
    public static void main(String[] args) {
        // Example usage
        int m = 5;
        int n = 8;
        int result = posOfRightMostDiffBit(m, n);
        System.out.println("Position of rightmost different bit: " + result);
    }
}
