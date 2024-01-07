class Day57 {
    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 2, 3, 4, 5};
        int N = arr.length;
        int K = 3;
        int result = Solution.splitArray(arr, N, K);
        System.out.println("Minimum sum after splitting array into " + K + " parts: " + result);
    }
}

class Solution {
    static int splitArray(int[] arr, int N, int K) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int start = 1;
        int end = sum;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (isPossible(mid, K, arr)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end + 1;
    }

    static boolean isPossible(int mid, int k, int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > mid) return false;
            if (sum > mid) {
                count++;
                sum = arr[i];
            }
        }
        if (sum <= mid) {
            count++;
        }

        return k >= count;
    }
}
