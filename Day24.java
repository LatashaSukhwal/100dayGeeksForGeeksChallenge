import java.util.Arrays;

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);

        int ans = arr[n - 1] - arr[0];

        int tempmin = arr[0];
        int tempmax = arr[n - 1];

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) {
                continue;
            }
            tempmin = Math.min(arr[0] + k, arr[i] - k);
            tempmax = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            ans = Math.min(ans, tempmax - tempmin);
        }
        return ans;
    }
}

public class Day24 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage with a sample array
        int[] arr = {1, 5, 8, 10};
        int n = arr.length;
        int k = 2;

        int result = solution.getMinDiff(arr, n, k);

        System.out.println("Minimum difference after modifying elements: " + result);
    }
}
