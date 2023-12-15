class Solution {
    void shuffleArray(long arr[], int n) {
        solve(arr, n / 2 - 1, n - 1, n);
    }

    void solve(long arr[], int i, int j, int count) {
        if (count <= 0) {
            return;
        }

        long a = arr[i];
        long b = arr[j];

        solve(arr, i - 1, j - 1, count - 2);

        arr[count - 2] = a;
        arr[count - 1] = b;
    }
}

public class Day15 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Testing the shuffleArray method
        int n = 6;
        long[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Original Array:");
        printArray(arr);

        solution.shuffleArray(arr, n);

        System.out.println("\nShuffled Array:");
        printArray(arr);
    }

    private static void printArray(long arr[]) {
        for (long num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
