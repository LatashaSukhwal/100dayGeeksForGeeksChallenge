import java.util.ArrayList;

class Solution {
    static long maximumSumSubarray(int k, ArrayList<Integer> Arr, int N) {
        // code here
        long max = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            sum += Arr.get(i);
        }
        max = Math.max(max, sum);
        for (int i = k; i < N; i++) {
            sum = sum - Arr.get(i - k);
            sum += Arr.get(i);
            max = Math.max(max, sum);
        }
        return max;
    }
}

public class Day30 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage with a sample ArrayList
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);

        int k = 3;
        int N = arrList.size();

        long result = solution.maximumSumSubarray(k, arrList, N);

        System.out.println("Maximum sum of subarray of size " + k + ": " + result);
    }
}
