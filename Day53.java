public class Day53 {
    public static void main(String[] args) {
        // Example usage:
        Solution solution = new Solution();

        // Example input array and N value
        int[] arr = {4, 3, 3, 2, 4, 2, 1};
        int N = arr.length;

        int result = solution.singleElement(arr, N);
        System.out.println("The single element in the array is: " + result);
    }
}

class Solution {
    static int singleElement(int[] arr, int N) {
        int one = 0;
        int two = 0;
        int bit;
        for (int i = 0; i < N; i++) {
            two = two | (one & arr[i]);
            one = one ^ arr[i];
            bit = ~(one & two);
            one = one & bit;
            two = two & bit;
        }
        return one;
    }
}
