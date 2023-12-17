class Day35 {
    public static void main(String[] args) {
        // Example usage of findMaxSum function
        Solution solution = new Solution();
        
        int[] arr = {3, 2, 7, 10};
        int n = arr.length;
        
        int maxSum = solution.findMaxSum(arr, n);
        
        System.out.println("Maximum sum is: " + maxSum);
    }
    
    // Paste the Solution class here with the findMaxSum method
    static class Solution {
        int findMaxSum(int arr[], int n) {
            // code here
            if(n == 1)
                return arr[0];
            
            int sum1 = arr[0], sum2 = Math.max(arr[0], arr[1]);
            
            for(int i = 2; i < n; i++) {
                int f = sum2;
                sum2 = Math.max(sum2, sum1 + arr[i]);
                sum1 = f;
            }
            return sum2;
        }
    }
}
