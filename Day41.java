import java.util.Arrays;

public class Day41 {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage
        int[] arr = {4, 3, 4, 4, 4, 2, 2, 1, 1};
        int n = arr.length;
        int k = 2;

        int result = solution.countOccurence(arr, n, k);

        System.out.println("The count of elements appearing more than n/k times is: " + result);
    }
}

class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) {
        int count = 0;
        Arrays.sort(arr);
        int threshold = n / k;

        for (int i = 0; i < n; i++) {
            int currentCount = 1;
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                currentCount++;
                i++;
            }
            if (currentCount > threshold) {
                count++;
            }
        }
        return count;
    }
}
