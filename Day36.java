class Day34 {
    static int gameOfXor(int N, int[] A) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            int contri = (i + 1) * (A.length - i);
            if (contri % 2 == 1) {
                ans ^= A[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example usage
        int[] array = {1, 2, 3, 4, 5};
        int result = gameOfXor(array.length, array);
        System.out.println("Result: " + result);
    }
}
