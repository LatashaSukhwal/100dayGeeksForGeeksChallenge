import java.util.HashMap;

class Day60 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example usage:
        int[] arr = {4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int k = 10;
        
        int result = solution.longSubarrWthSumDivByK(arr, n, k);
        
        System.out.println("Length of the longest subarray with sum divisible by " + k + " is: " + result);
    }
}
